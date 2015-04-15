(ns GoodLuckAK.core
  (:require [GoodLuckAK.colors :refer :all])
  (:gen-class))

(defn -main
  [& args]
  (with (chg-color)
    (println "It was a great pleasure to work with you. Good luck and all the best in the future!")
    (println " - Mircea & Zsolt")
    (println " - Wiebke")
    (println " - Enda")
    (println " - Antti Heinonen")
    (println " - Luigi")
    (println " - Thomas - Thanks for working with us! (OO)/")
    (println " - Zeno .. thank you for showing me nyan mode and helping me to set up my beloved Visual Studio shortcuts in Emacs.")
    (println " - count .. Thanks for all the effort & heart put in for Linux & OSS at HERE!")
    (println " - Lukas - I used vim for this. Who would ever use emacs?")
    (println " - Stefan. I know I challenged your patience a lot ;)\n"
             "           REAL PROGRAMMERS USE emacs! https://xkcd.com/378/")
    (println " - Elke - May your new adventures bring you lots of fun and excitement!")
    (println " - Tillmann")
    (println " - Matthias")
    (println " - TEAM NMAA")
    (println " - Suresh - Good luck for the new venture!")
    (println " - Marco - Good luck and all the best! Keep sticking with your principles - and consider switching to vi :-)")
    (println " - Jun")
    (println " - Thorsten - You convinced me to use Fedora, lots of fascinating bugs I'd have missed otherwise ;-) cu on codewars :-)")
    (println " - Jeremie - I wish you a future filled with happiness"))
  (print unchg-color))
