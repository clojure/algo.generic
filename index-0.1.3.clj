{:namespaces
 ({:doc
   "Generic arithmetic interface\nThis library defines generic versions of + - * / as multimethods\nthat can be defined for any type. The minimal required \nimplementations for a type are binary + and * plus unary - and /.\nEverything else is derived from these automatically. Explicit\nbinary definitions for - and / can be provided for\nefficiency reasons.",
   :author "Konrad Hinsen",
   :name "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic/clojure.algo.generic.arithmetic-api.html",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:doc
   "Generic collection interface\nThis library defines generic versions of common\ncollection-related functions as multimethods that can be\ndefined for any type.",
   :author "Konrad Hinsen",
   :name "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic/clojure.algo.generic.collection-api.html",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj"}
  {:doc
   "Generic comparison interface\nThis library defines generic versions of = not= < > <= >= zero?\nas multimethods that can be defined for any type. Of the\ngreater/less-than relations, types must minimally implement >.",
   :author "Konrad Hinsen",
   :name "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic/clojure.algo.generic.comparison-api.html",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:doc "Generic functor interface (fmap)",
   :author "Konrad Hinsen",
   :name "clojure.algo.generic.functor",
   :wiki-url
   "http://clojure.github.io/algo.generic/clojure.algo.generic.functor-api.html",
   :source-url
   "https://github.com/clojure/algo.generic/blob/aa028f7467d193a5cfad0626b324f4c682b91c15/src/main/clojure/clojure/algo/generic/functor.clj"}
  {:doc
   "Generic math function interface\nThis library defines generic versions of common mathematical\nfunctions such as sqrt or sin as multimethods that can be\ndefined for any type.",
   :author "Konrad Hinsen",
   :name "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic/clojure.algo.generic.math-functions-api.html",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "*",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L111",
   :line 111,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the product of all arguments. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/*"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "+",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L45",
   :line 45,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the sum of all arguments. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/+"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "-",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L77",
   :line 77,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the difference of the first argument and the sum of all other\narguments. The minimal implementation for type ::my-type is the binary\nform with dispatch value [::my-type ::my-type].",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/-"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "->one-type",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L34",
   :line 34,
   :var-type "function",
   :arglists ([]),
   :doc
   "Positional factory function for class clojure.algo.generic.arithmetic.one-type.",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/->one-type"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "->zero-type",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L30",
   :line 30,
   :var-type "function",
   :arglists ([]),
   :doc
   "Positional factory function for class clojure.algo.generic.arithmetic.zero-type.",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/->zero-type"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "/",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L143",
   :line 143,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return the quotient of the first argument and the product of all other\narguments. The minimal implementation for type ::my-type is the binary\nform with dispatch value [::my-type ::my-type].",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic//"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "defmethod*",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L173",
   :line 173,
   :var-type "macro",
   :arglists ([ns name & args]),
   :doc
   "Define a method implementation for the multimethod name in namespace ns.\nRequired for implementing the division function from another namespace.",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/defmethod*"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "map->one-type",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L34",
   :line 34,
   :var-type "function",
   :arglists ([m#]),
   :doc
   "Factory function for class clojure.algo.generic.arithmetic.one-type, taking a map of keywords to field values.",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/map->one-type"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "map->zero-type",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L30",
   :line 30,
   :var-type "function",
   :arglists ([m#]),
   :doc
   "Factory function for class clojure.algo.generic.arithmetic.zero-type, taking a map of keywords to field values.",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/map->zero-type"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :name "qsym",
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L180",
   :line 180,
   :var-type "macro",
   :arglists ([ns sym]),
   :doc
   "Create the qualified symbol corresponding to sym in namespace ns.\nRequired to access the division function from another namespace,\ne.g. as (qsym clojure.algo.generic.arithmetic /).",
   :namespace "clojure.algo.generic.arithmetic",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/qsym"}
  {:name "one-type",
   :var-type "record",
   :namespace "clojure.algo.generic.arithmetic",
   :arglists nil,
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/one-type",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "zero-type",
   :var-type "record",
   :namespace "clojure.algo.generic.arithmetic",
   :arglists nil,
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/zero-type",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "assoc",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L25",
   :line 25,
   :var-type "multimethod",
   :arglists ([coll & key-val-pairs]),
   :doc
   "Returns a new collection in which the values corresponding to the\ngiven keys are updated by the given values. Each type of collection\ncan have specific restrictions on the possible keys.",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/assoc"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "conj",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L39",
   :line 39,
   :var-type "multimethod",
   :arglists ([coll & xs]),
   :doc
   "Returns a new collection resulting from adding all xs to coll.",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/conj"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "dissoc",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L51",
   :line 51,
   :var-type "multimethod",
   :arglists ([coll & keys]),
   :doc
   "Returns a new collection in which the entries corresponding to the\ngiven keys are removed. Each type of collection can have specific\nrestrictions on the possible keys.",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/dissoc"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "empty",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L65",
   :line 65,
   :var-type "multimethod",
   :arglists ([coll]),
   :doc "Returns an empty collection of the same kind as the argument",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/empty"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "get",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L77",
   :line 77,
   :var-type "multimethod",
   :arglists ([coll key] [coll key not-found]),
   :doc
   "Returns the element of coll referred to by key. Each type of collection\ncan have specific restrictions on the possible keys.",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/get"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "into",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L92",
   :line 92,
   :var-type "multimethod",
   :arglists ([to from]),
   :doc
   "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined. A default implementation based on reduce, conj, and\nseq is provided.",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/into"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :name "seq",
   :file "src/main/clojure/clojure/algo/generic/collection.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L107",
   :line 107,
   :var-type "multimethod",
   :arglists ([s]),
   :doc "Returns a seq on the object s.",
   :namespace "clojure.algo.generic.collection",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/seq"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "<",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L91",
   :line 91,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each argument is smaller than the following ones.\nThe minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of >.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/<"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "<=",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L143",
   :line 143,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each arguments is smaller than or equal to the following\nones. The minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of >.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/<="}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "=",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L45",
   :line 45,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if all arguments are equal. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/="}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name ">",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L70",
   :line 70,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each argument is larger than the following ones.\nThe minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type].",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/>"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name ">=",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L117",
   :line 117,
   :var-type "multimethod",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Return true if each argument is larger than or equal to the following\nones. The minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of <.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/>="}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "max",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L204",
   :line 204,
   :var-type "function",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Returns the greatest of its arguments. Like clojure.core/max except that\nis uses generic comparison functions implementable for any data type.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/max"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "min",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L212",
   :line 212,
   :var-type "function",
   :arglists ([x] [x y] [x y & more]),
   :doc
   "Returns the least of its arguments. Like clojure.core/min except that\nis uses generic comparison functions implementable for any data type.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/min"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "neg?",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L37",
   :line 37,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return true of x is negative.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/neg?"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "not=",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L62",
   :line 62,
   :var-type "function",
   :arglists ([& args]),
   :doc "Equivalent to (not (= ...)).",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/not="}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "pos?",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L32",
   :line 32,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return true of x is positive.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/pos?"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :name "zero?",
   :file "src/main/clojure/clojure/algo/generic/comparison.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L27",
   :line 27,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return true of x is zero.",
   :namespace "clojure.algo.generic.comparison",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/zero?"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/aa028f7467d193a5cfad0626b324f4c682b91c15/src/main/clojure/clojure/algo/generic/functor.clj",
   :name "fmap",
   :file "src/main/clojure/clojure/algo/generic/functor.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/aa028f7467d193a5cfad0626b324f4c682b91c15/src/main/clojure/clojure/algo/generic/functor.clj#L19",
   :line 19,
   :var-type "multimethod",
   :arglists ([f s]),
   :doc
   "Applies function f to each item in the data structure s and returns\na structure of the same kind.",
   :namespace "clojure.algo.generic.functor",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.functor-api.html#clojure.algo.generic.functor/fmap"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "abs",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L89",
   :line 89,
   :var-type "multimethod",
   :arglists ([x] [x math-context]),
   :doc
   "Return the absolute value of x. If x is a BigDecimal, abs takes an optional\nmath-context argument.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/abs"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "acos",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L64",
   :line 64,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the acos of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/acos"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "approx=",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L208",
   :line 208,
   :var-type "function",
   :arglists ([x y eps]),
   :doc
   "Return true if the absolute value of the difference between x and y\nis less than eps.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/approx="}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "asin",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L65",
   :line 65,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the asin of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/asin"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "atan",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L66",
   :line 66,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the atan of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/atan"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "atan2",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L67",
   :line 67,
   :var-type "multimethod",
   :arglists ([x y]),
   :doc "Return the atan2 of x and y.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/atan2"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "ceil",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L68",
   :line 68,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the ceil of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/ceil"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "conjugate",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L185",
   :line 185,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the conjugate of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/conjugate"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "cos",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L69",
   :line 69,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the cos of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/cos"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "defmacro-",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L29",
   :line 29,
   :var-type "macro",
   :arglists ([name & decls]),
   :doc "Same as defmacro but yields a private definition",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/defmacro-"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "exp",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L70",
   :line 70,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the exp of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/exp"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "floor",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L71",
   :line 71,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the floor of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/floor"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "log",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L72",
   :line 72,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the log of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/log"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "pow",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L73",
   :line 73,
   :var-type "multimethod",
   :arglists ([x y]),
   :doc "Return the pow of x and y.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/pow"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "rint",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L74",
   :line 74,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the rint of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/rint"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "round",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L135",
   :line 135,
   :var-type "multimethod",
   :arglists ([x] [x math-context]),
   :doc
   "Round x.\nIf x is a BigDecimal, a math-context argument is also required:\n  (round x math-context)\nIf x is a Ratio,\n  (round x) converts x to a double and rounds;\n  (round x math-context) converts x to a BigDecimal and rounds.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/round"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "sgn",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L171",
   :line 171,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the sign of x (-1, 0, or 1).",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sgn"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "sin",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L75",
   :line 75,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the sin of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sin"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "sqr",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L196",
   :line 196,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the square of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sqr"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "sqrt",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L76",
   :line 76,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the sqrt of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sqrt"}
  {:raw-source-url
   "https://github.com/clojure/algo.generic/raw/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :name "tan",
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj",
   :source-url
   "https://github.com/clojure/algo.generic/blob/d90c2ba1fdb01306bd0fc1d6434527a6d549f73f/src/main/clojure/clojure/algo/generic/math_functions.clj#L77",
   :line 77,
   :var-type "multimethod",
   :arglists ([x]),
   :doc "Return the tan of x.",
   :namespace "clojure.algo.generic.math-functions",
   :wiki-url
   "http://clojure.github.io/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/tan"})}
