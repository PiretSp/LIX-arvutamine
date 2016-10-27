#i200 LIX arvutamine

PROJEKTI JAVAFX-I VARIANT ASUB SIIN: https://github.com/PiretSp/LixArvutamineJavaFX

Loetavusindeks LIX on välja töötatud rootslase Björnssoni poolt 1968. aastal. Sellise programmi eesmärgiks on välja arvutada teksti keerukus. See on vajalik, kuna lugemis- ja kirjutamisraskustega õpilaste puhul on vaja tekste lihtsustada - pikad sõnad (7 või rohkem tähte) asendada lühematega ja laused teha võimalikult lühikeseks. Lugemisraskustega õpilastel on pikki sõnu ja lauseid keeruline mõista.

Programm näeks välja järgmine:
* Kasutaja sisestab teksti, mida on vaja analüüsida (kopeerib, kirjutab ümber vms). Koht, kuhu see tekst lisada, võiks olla nt kastike.
* Programm:
- lugema kokku kõik tekstis olevad sõnad (A),
- lugema kokku tekstis olevad laused (B),
- arvutama lause keskmise pikkuse (C=A/B),
- leidma tekstis pikad sõnad ehk sõnad, mis on 7 tähte või rohkem (D),
- leidma keeruliste sõnade osakaalu tekstis (E=D*100/A),
- arvutama loetavusindeksi (LIX=C+E).
* Programm kuvab kasutajale vastuse, kas milline on teksti raskusaste (Nt LIX = 25, lausepikkus 11, pikki sõnu 13%) ja väljastab analüüsistud teksti, kus on markeeritud keerulised sõnad (7 ja rohkem tähte). Vajadusel on võimalik ka pikad laused eraldi välja tuua, kuid selleks pean veel eeltööd tegema, kui pikk on keeruline lause.

Teksti keerukus: 
* LIX 20 = väga lihtne (lausepikkus 9, pikki sõnu 11%) 
* LIX 30 = lihtne (lausepikkus 13, pikki sõnu 17%) 
* LIX 40 = keskmine (lausepikkus 16, pikki sõnu 24%) 
* LIX 50 = raske (lausepikkus 19, pikki sõnu 31%) 
* LIX 60 = väga raske (lausepikkus 22, pikki sõnu 38%)

LIXi arvutamisel tuleb arvestada, et sellega saab kontrollida ainult seotud teksti, st mitte luuletusi, näidendeid, sisukordi, sõnaloendeid, pealkirju ja piltide allkirju. Arve, lühendeid ja sümboleid arvestatakse kui sõnu, kirjavahemärkide kohta see ei kehti. Oluline on algustäht - kui otsekõnele eelneb saatelause, siis neid arvestatakse eraldi lausetena, kuna oluline on suur algustäht. Näiteks: Mari ütles: "Peeter, mine poodi!" on kaks eraldi lauset. Kui otsekõnele järgneb saatelause, siis arvestatakse see ühe lausena. Näiteks: "Peeter, mine poodi!" ütles Mari.

Lauseid eristavad lauselõpumärgid (.!?) ja suur algustäht. Kõige keerulisem oleks LIX programmi juures see, kui lause sees on punktid (nt järgarvud). Üldiselt on sel juhul järgnev sõna väikese tähega (Nt Täna on 28.september), kuid kui järgnev sõna peaks olema suure algustähega, siis on olukord programmi jaoks keerulisem (Nt Ta on enda suguvõsa 17. Alexander). Samas see ei muudaks teksti keerukust kuigi palju, kui programm need ka eraldi lauseteks arvutaks, sest sellise lause esinemise tõenäosus on küllaltki väike.

Kuidas ma enda programmile objektorienteerituse külge liidan, seda ma veel ei tea, kuna minu jaoks on objektorienteerituse teema veidi segane. Loodan sellele aga praktikumis vastuse saada.
