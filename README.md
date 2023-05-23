# calculator-java
simple calculator written in Java; supports addition, subtraction, multiplication and division


Broj linija koda (LOC): Datoteka "Calculator.java" ima ukupno 188 linija koda (134 LOC).

Ciklomatska složenost: Ciklomatska složenost meri broj puteva kroz kod i određuje minimalni broj testova potrebnih za potpunu pokrivenost. U ovom slučaju, ciklomatska složenost ovisi o složenosti metode Calculate(). S obzirom na to da metoda ima nekoliko uslovnih izjava i petlji, može se pretpostaviti da je ciklomatska složenost prilično visoka.

Kognitivna složenost:  Ova datoteka ima nekoliko unutarnjih klasa, statičkih metoda i kompleksnih algoritama za evaluaciju izraza. To može povećati kognitivnu složenost i otežati razumevanje koda.

Potencijalne greške:

U liniji 20: Metoda ToString() je napisana s velikim početnim slovom, što nije u skladu s konvencijama imenovanja u Javi. Trebala bi biti napisana kao toString().

U liniji 36: Postoji greška u dodavanju nule na početak izraza ako izraz započinje s "+" ili "-". Trenutna implementacija dodaje nulu kao znakovni niz umjesto broja. Ispravna implementacija bi bila expression = "0" + expression;.

U liniji 46: Petlja za parsiranje operacija (znakova) ne obrađuje posljednji znak izraza. Trebalo bi promeniti uslov petlje u i < expression.length() umesto i < expression.length() - 1 kako bi se uključio i posljednji znak.

U linijama 53-71: Petlja za parsiranje brojeva u float vrednosti ne obrađuje specijalne slučajeve kao što su "-Infinity" i "Infinity" ispravno. Trenutno se te vrednosti skladiste kao znakovni nizovi umesto odgovarajućih float vrednosti. Trebalo bi dodati provere za ove slučajeve i pravilno parsirati brojeve.

U linijama 86-119: Metoda Calculate() ima složenu logiku za izračun rezultata iz liste brojeva i operacija. Postoji nekoliko potencijalnih grešaka u logici, uključujući nepravilno rukovanje množenjem i deljenjem kada su prisutni i sabiranje i oduzimanje. Također, manipulacija listama brojeva i operacija može dovesti do pogrešnih rezultata.

# start-java
Broj linija koda (LOC): Ovaj kod ima ukupno 26 linija (19 LOC).

Ciklomatska složenost: Ciklomatska složenost je 2 jer postoji samo jedna petlja while koja ima samo dva moguća izlaza - izlaz iz petlje kad je Expression jednaka "exit" i nastavak petlje u suprotnom slučaju.

Kognitivna složenost: Ovaj kod ima jednostavnu strukturu koja samo očekuje unos izraza i ispisuje rezultat. Kognitivna složenost je relativno niska jer nema složenih algoritama ili složenih kontrolnih struktura.

Potencijalne greške:

U liniji 13: Nakon svake iteracije petlje, skener scanIn treba biti zatvoren kako bi se izbjegao curenje resursa. Trenutno je skener zatvoren samo kad je Expression jednaka "exit". Trebalo bi dodati scanIn.close(); odmah nakon čitanja unosa u petlji kako bi se osiguralo pravilno zatvaranje skenera.
