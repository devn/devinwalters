(ns devinwalters.views.home
  (:require [devinwalters.views.common :as common])
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpage "/" []
  (common/layout))
