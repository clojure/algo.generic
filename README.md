# algo.generic

Generic versions of commonly used functions, implemented as multimethods
that can be implemented for any data type.

## Usage

Each submodule of clojure.algo.generic defines a set of related
multimethods that have the same names as their type-specific
counterparts in clojure.core. Implementations for standard Clojure
data types are provided and behave identically to the clojure.core
versions.

### Arities

Arithmetic and comparison functions are defined for the same arities
that the corresponding clojure.core functions support.  Arities higher
than 2 are reduced to unary and binary calls. To provide a multimethod
implementation for binary calls with a given pair of types, use
`[type1 type2]` as the dispatch value. For a unary call, the dispatch
value is `type` as usual. Note that `[type1 type2]` is different from
`[type2 type1]` (in most cases you will want to provide both) and that
`[type type]` (binary operation with both arguments of the same type)
is different from `type` (unary operation).

### Root type

This section applies only to binary operations dispatching on type
pairs, and only for types that are *not* Java classes. Types
created by `deftype` and `defrecord` are Java classes, meaning that
most Clojure programmers can go on with the next section.

One difficulty with binary operations is that there is no predefined
way to provide a default implementation. For single dispatch there is
`:default`, but there is nothing equivalent to `[:default :default]`.
The algo.generic library therefore defines a *root type*, accessible
as `clojure.algo.generic/root-type`, which is used in the default
implementations of binary operations. To integrate your own type into
this system, you must add the clause `(derive my-type
clojure.algo.generic/root-type)` after your type definition. This is
not required for Java classes because `java.lang.Object` is
already derived from `root-type`.

### Submodules

* **algo.generic.arithmetic** provides generic `+` `-` `*` `/` for all
  the arities that the corresponding clojure.core functions support.
  The minimal implementations required for full arithmetic on a given
  type is binary `+` and `*` and unary `-` and `/`. You may wish to
  provide explicit implementations for binary `-` and `/` for
  efficiency, otherwise the default implementations are `(- a b) => (+ a (- b))`
   and `(/ a b) => (* a (/ b))`.

* **algo.generic.collection** provides generic versions of `assoc`,
  `dissoc`, `get`, `conj`, `empty`, `into`, and `seq`. `into` has a
  default implementation in terms of `conj` and `seq`, but you may
  wish to provide a more efficient one for your types.

* **algo.generic.comparison** provides the comparison and test
  functions `=`, `not=`, `<`, `>`, `<=`, `>=`, `zero?`, `pos?`,
  `neg?`, `min`, and ` max`. `not=`, `min`, and `max` cannot be
  redefined, they are standard functions that are implemented in
  terms of the generic functions of the module. A minimal
  implementation of the binary comparison functions consists of
  `=` and `>`. Default implementations for `<`, `<=`, and `>=`
  call `>`, but more efficient implementations can be provided.

* **algo.generic.functor** provides a generic mapping operation
  called `fmap`.

* **algo.generic.math-functions** provides generic versions of the
  common math functions from `java.lang.Math`, plus `sgn`, `sqr`, and
  `conjugate`.


## Releases and dependency information

Latest stable release: 0.1.3

* [All released versions](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.clojure%22%20AND%20a%3A%22algo.generic%22)

* [Development Snapshot Versions](https://oss.sonatype.org/index.html#nexus-search;gav~org.clojure~algo.generic~~~)

[Leiningen](http://github.com/technomancy/leiningen/) dependency information:

    [org.clojure/algo.generic "0.1.3"]

[Maven](http://maven.apache.org/) dependency information:

    <dependency>
      <groupId>org.clojure</groupId>
      <artifactId>algo.generic</artifactId>
      <version>0.1.3</version>
    </dependency>

## License

Copyright (c) Rich Hickey and contributors. All rights reserved.

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
which can be found in the file epl.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.
You must not remove this notice, or any other, from this software.


