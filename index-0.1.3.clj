{:namespaces
 ({:source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic/clojure.algo.generic.arithmetic-api.html",
   :name "clojure.algo.generic.arithmetic",
   :author "Konrad Hinsen",
   :doc
   "Generic arithmetic interface\nThis library defines generic versions of + - * / as multimethods\nthat can be defined for any type. The minimal required \nimplementations for a type are binary + and * plus unary - and /.\nEverything else is derived from these automatically. Explicit\nbinary definitions for - and / can be provided for\nefficiency reasons."}
  {:source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic/clojure.algo.generic.collection-api.html",
   :name "clojure.algo.generic.collection",
   :author "Konrad Hinsen",
   :doc
   "Generic collection interface\nThis library defines generic versions of common\ncollection-related functions as multimethods that can be\ndefined for any type."}
  {:source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic/clojure.algo.generic.comparison-api.html",
   :name "clojure.algo.generic.comparison",
   :author "Konrad Hinsen",
   :doc
   "Generic comparison interface\nThis library defines generic versions of = not= < > <= >= zero?\nas multimethods that can be defined for any type. Of the\ngreater/less-than relations, types must minimally implement >."}
  {:source-url
   "https://github.com/clojure/algo.generic/blob/aa028f7467d193a5cfad0626b324f4c682b91c15/src/main/clojure/clojure/algo/generic/functor.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic/clojure.algo.generic.functor-api.html",
   :name "clojure.algo.generic.functor",
   :author "Konrad Hinsen",
   :doc "Generic functor interface (fmap)"}
  {:source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic/clojure.algo.generic.math-functions-api.html",
   :name "clojure.algo.generic.math-functions",
   :author "Konrad Hinsen",
   :doc
   "Generic math function interface\nThis library defines generic versions of common mathematical\nfunctions such as sqrt or sin as multimethods that can be\ndefined for any type."}),
 :vars
 ({:arglists ([x] [x y] [x y & more]),
   :name "*",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L111",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/*",
   :doc
   "Return the product of all arguments. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :var-type "multimethod",
   :line 111,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "+",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L45",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/+",
   :doc
   "Return the sum of all arguments. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :var-type "multimethod",
   :line 45,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "-",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L77",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/-",
   :doc
   "Return the difference of the first argument and the sum of all other\narguments. The minimal implementation for type ::my-type is the binary\nform with dispatch value [::my-type ::my-type].",
   :var-type "multimethod",
   :line 77,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([]),
   :name "->one-type",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L34",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/->one-type",
   :doc
   "Positional factory function for class clojure.algo.generic.arithmetic.one-type.",
   :var-type "function",
   :line 34,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([]),
   :name "->zero-type",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L30",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/->zero-type",
   :doc
   "Positional factory function for class clojure.algo.generic.arithmetic.zero-type.",
   :var-type "function",
   :line 30,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "/",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L143",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic//",
   :doc
   "Return the quotient of the first argument and the product of all other\narguments. The minimal implementation for type ::my-type is the binary\nform with dispatch value [::my-type ::my-type].",
   :var-type "multimethod",
   :line 143,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([ns name & args]),
   :name "defmethod*",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L173",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/defmethod*",
   :doc
   "Define a method implementation for the multimethod name in namespace ns.\nRequired for implementing the division function from another namespace.",
   :var-type "macro",
   :line 173,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([m__5818__auto__]),
   :name "map->one-type",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L34",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/map->one-type",
   :doc
   "Factory function for class clojure.algo.generic.arithmetic.one-type, taking a map of keywords to field values.",
   :var-type "function",
   :line 34,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([m__5818__auto__]),
   :name "map->zero-type",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L30",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/map->zero-type",
   :doc
   "Factory function for class clojure.algo.generic.arithmetic.zero-type, taking a map of keywords to field values.",
   :var-type "function",
   :line 30,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:arglists ([ns sym]),
   :name "qsym",
   :namespace "clojure.algo.generic.arithmetic",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj#L180",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/arithmetic.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/qsym",
   :doc
   "Create the qualified symbol corresponding to sym in namespace ns.\nRequired to access the division function from another namespace,\ne.g. as (qsym clojure.algo.generic.arithmetic /).",
   :var-type "macro",
   :line 180,
   :file "src/main/clojure/clojure/algo/generic/arithmetic.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/one-type",
   :namespace "clojure.algo.generic.arithmetic",
   :var-type "record",
   :name "one-type"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.arithmetic-api.html#clojure.algo.generic.arithmetic/zero-type",
   :namespace "clojure.algo.generic.arithmetic",
   :var-type "record",
   :name "zero-type"}
  {:arglists ([coll & key-val-pairs]),
   :name "assoc",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L25",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/assoc",
   :doc
   "Returns a new collection in which the values corresponding to the\ngiven keys are updated by the given values. Each type of collection\ncan have specific restrictions on the possible keys.",
   :var-type "multimethod",
   :line 25,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([coll & xs]),
   :name "conj",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L39",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/conj",
   :doc
   "Returns a new collection resulting from adding all xs to coll.",
   :var-type "multimethod",
   :line 39,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([coll & keys]),
   :name "dissoc",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L51",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/dissoc",
   :doc
   "Returns a new collection in which the entries corresponding to the\ngiven keys are removed. Each type of collection can have specific\nrestrictions on the possible keys.",
   :var-type "multimethod",
   :line 51,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([coll]),
   :name "empty",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L65",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/empty",
   :doc "Returns an empty collection of the same kind as the argument",
   :var-type "multimethod",
   :line 65,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([coll key] [coll key not-found]),
   :name "get",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L77",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/get",
   :doc
   "Returns the element of coll referred to by key. Each type of collection\ncan have specific restrictions on the possible keys.",
   :var-type "multimethod",
   :line 77,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([to from]),
   :name "into",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L92",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/into",
   :doc
   "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined. A default implementation based on reduce, conj, and\nseq is provided.",
   :var-type "multimethod",
   :line 92,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([s]),
   :name "seq",
   :namespace "clojure.algo.generic.collection",
   :source-url
   "https://github.com/clojure/algo.generic/blob/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj#L107",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/ff0ff6f911e3624a2296376c829900c779513047/src/main/clojure/clojure/algo/generic/collection.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.collection-api.html#clojure.algo.generic.collection/seq",
   :doc "Returns a seq on the object s.",
   :var-type "multimethod",
   :line 107,
   :file "src/main/clojure/clojure/algo/generic/collection.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "<",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L91",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/<",
   :doc
   "Return true if each argument is smaller than the following ones.\nThe minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of >.",
   :var-type "multimethod",
   :line 91,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "<=",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L143",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/<=",
   :doc
   "Return true if each arguments is smaller than or equal to the following\nones. The minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of >.",
   :var-type "multimethod",
   :line 143,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "=",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L45",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/=",
   :doc
   "Return true if all arguments are equal. The minimal implementation for type\n::my-type is the binary form with dispatch value [::my-type ::my-type].",
   :var-type "multimethod",
   :line 45,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name ">",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L70",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/>",
   :doc
   "Return true if each argument is larger than the following ones.\nThe minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type].",
   :var-type "multimethod",
   :line 70,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name ">=",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L117",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/>=",
   :doc
   "Return true if each argument is larger than or equal to the following\nones. The minimal implementation for type ::my-type is the binary form\nwith dispatch value [::my-type ::my-type]. A default implementation\nis provided in terms of <.",
   :var-type "multimethod",
   :line 117,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "max",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L204",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/max",
   :doc
   "Returns the greatest of its arguments. Like clojure.core/max except that\nis uses generic comparison functions implementable for any data type.",
   :var-type "function",
   :line 204,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "min",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L212",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/min",
   :doc
   "Returns the least of its arguments. Like clojure.core/min except that\nis uses generic comparison functions implementable for any data type.",
   :var-type "function",
   :line 212,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x]),
   :name "neg?",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L37",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/neg?",
   :doc "Return true of x is negative.",
   :var-type "multimethod",
   :line 37,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([& args]),
   :name "not=",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L62",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/not=",
   :doc "Equivalent to (not (= ...)).",
   :var-type "function",
   :line 62,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x]),
   :name "pos?",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L32",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/pos?",
   :doc "Return true of x is positive.",
   :var-type "multimethod",
   :line 32,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([x]),
   :name "zero?",
   :namespace "clojure.algo.generic.comparison",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj#L27",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/comparison.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.comparison-api.html#clojure.algo.generic.comparison/zero?",
   :doc "Return true of x is zero.",
   :var-type "multimethod",
   :line 27,
   :file "src/main/clojure/clojure/algo/generic/comparison.clj"}
  {:arglists ([f s]),
   :name "fmap",
   :namespace "clojure.algo.generic.functor",
   :source-url
   "https://github.com/clojure/algo.generic/blob/aa028f7467d193a5cfad0626b324f4c682b91c15/src/main/clojure/clojure/algo/generic/functor.clj#L19",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/aa028f7467d193a5cfad0626b324f4c682b91c15/src/main/clojure/clojure/algo/generic/functor.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.functor-api.html#clojure.algo.generic.functor/fmap",
   :doc
   "Applies function f to each item in the data structure s and returns\na structure of the same kind.",
   :var-type "multimethod",
   :line 19,
   :file "src/main/clojure/clojure/algo/generic/functor.clj"}
  {:arglists ([x]),
   :name "abs",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L60",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/abs",
   :doc "Return the abs of x.",
   :var-type "multimethod",
   :line 60,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "acos",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L61",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/acos",
   :doc "Return the acos of x.",
   :var-type "multimethod",
   :line 61,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x y eps]),
   :name "approx=",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L117",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/approx=",
   :doc
   "Return true if the absolute value of the difference between x and y\nis less than eps.",
   :var-type "function",
   :line 117,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "asin",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L62",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/asin",
   :doc "Return the asin of x.",
   :var-type "multimethod",
   :line 62,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "atan",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L63",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/atan",
   :doc "Return the atan of x.",
   :var-type "multimethod",
   :line 63,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x y]),
   :name "atan2",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L64",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/atan2",
   :doc "Return the atan2 of x and y.",
   :var-type "multimethod",
   :line 64,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "ceil",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L65",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/ceil",
   :doc "Return the ceil of x.",
   :var-type "multimethod",
   :line 65,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "conjugate",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L94",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/conjugate",
   :doc "Return the conjugate of x.",
   :var-type "multimethod",
   :line 94,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "cos",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L66",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/cos",
   :doc "Return the cos of x.",
   :var-type "multimethod",
   :line 66,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([name & decls]),
   :name "defmacro-",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L25",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/defmacro-",
   :doc "Same as defmacro but yields a private definition",
   :var-type "macro",
   :line 25,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "exp",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L67",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/exp",
   :doc "Return the exp of x.",
   :var-type "multimethod",
   :line 67,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "floor",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L68",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/floor",
   :doc "Return the floor of x.",
   :var-type "multimethod",
   :line 68,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "log",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L69",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/log",
   :doc "Return the log of x.",
   :var-type "multimethod",
   :line 69,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x y]),
   :name "pow",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L70",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/pow",
   :doc "Return the pow of x and y.",
   :var-type "multimethod",
   :line 70,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "rint",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L71",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/rint",
   :doc "Return the rint of x.",
   :var-type "multimethod",
   :line 71,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "round",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L72",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/round",
   :doc "Return the round of x.",
   :var-type "multimethod",
   :line 72,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "sgn",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L80",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sgn",
   :doc "Return the sign of x (-1, 0, or 1).",
   :var-type "multimethod",
   :line 80,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "sin",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L73",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sin",
   :doc "Return the sin of x.",
   :var-type "multimethod",
   :line 73,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "sqr",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L105",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sqr",
   :doc "Return the square of x.",
   :var-type "multimethod",
   :line 105,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "sqrt",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L74",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/sqrt",
   :doc "Return the sqrt of x.",
   :var-type "multimethod",
   :line 74,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"}
  {:arglists ([x]),
   :name "tan",
   :namespace "clojure.algo.generic.math-functions",
   :source-url
   "https://github.com/clojure/algo.generic/blob/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj#L75",
   :raw-source-url
   "https://github.com/clojure/algo.generic/raw/b363d06b4a812bf4527232bff9917d0298f6f837/src/main/clojure/clojure/algo/generic/math_functions.clj",
   :wiki-url
   "http://clojure.github.com/algo.generic//clojure.algo.generic.math-functions-api.html#clojure.algo.generic.math-functions/tan",
   :doc "Return the tan of x.",
   :var-type "multimethod",
   :line 75,
   :file "src/main/clojure/clojure/algo/generic/math_functions.clj"})}
