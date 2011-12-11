(ns devinwalters.views.common
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defpartial layout [& content]
  (html5
   [:head
    [:title "Devin Walters"]
    (include-css "/css/style.css")]
   [:body
    [:div#wrapper
     [:div#main
      [:h1 (link-to "/" "(devin walters)")]]
     content]
    [:div#category
     [:h1.title "Writing"]
     [:ul
      [:li "Read my " (link-to "http://condensery.com" "technical blog")]]]
    [:div#category
     [:h1.title "Projects"]
     [:ul
      [:li (link-to "http://getclojure.org" "getclojure.org")]
      [:li (link-to "http://syntacks.org" "syntacks.com")]]]
    [:div#category
     [:h1.title "Contact"]
     [:ul
      [:li "follow me on " (link-to "http://twitter.com/devn" "twitter")]
      [:li "/msg devn on irc.freenode.net"]
      [:li "check out my " (link-to "http://github.com/devn" "github profile")]]]
    [:div#category
     [:h1.title "Interests"]
     [:ul
      [:li "programming"]
      [:li "art"]
      [:li "music"]
      [:li "philosophy"]]]]))
