# Fájlkezelő

## 1. Vezetői összefoglaló

## 2. Jelenlegi helyzet
A cég egy gyár, ahol szorosan egymásra épülő gyártási folyamatok vannak így <br>
a dokumentáció kiemelt figyelmet igényel, hisz egy nagy cégnél több részlegből<br>
állhat a gyártási folyamat. Ezek a részlegek egymással kommunikálnak hosszú<br>
dokumentációk, képek, tervrajzok és hanganyag formájában is, illetve ezeknek a <br>
kommunikációs folyamatoknak is nyomonkövethetőnek kell lennie. A cégnél a dokumentációs<br>
munkálatok nagyrészt papír alapon működnek amelyek rendkívül lassúak pedig az<br>
internet és a hálózatok megjelenésével jelentősen lehet gyorsítani a manuálisan <br>
elvégezhető munkák nagy részét, ez az egyik fő ok amiért szeretnénk forradalmasítani<br>
a gyár működését. Ezen kívül amikor a dokumentációs és egyéb a gyártási folyamathoz<br>
szükséges anyagok leadása/átvitele történik az illetékes személyhez/személyekhez<br>
mindkét félnek jelen kell lennie az átadásnál mert más esetben nyomonkövethetetlen<br>
lenne a dokumentumok áramlása ami további problémákhoz vezethet. Ezek könnyen <br>
automatizálható folyamatok amelyek, további időt vesznek el a tényleges munkaidőből<br>
azaz csökken a gyár effektív munkavégzése. Ezek mellett az emberi hiba esélye is<br>
sokkal nagyobb hisz fenn áll a veszélye, hogy a dokumentációk nem jutnak el időben<br>
a cég többi részlegéhez, esetleges illetékes emberekhez. Biztonsági kockázatok is<br>
fennállnak mert fizikailag a dokumentumokat el kell helyezni valahol, és fenn áll<br>
a veszélye, hogy ezekhez illetéktelen személyek is hozzáférnek. Egy professzionális<br>
rendszer ezeket a folyamatokat gyökeresen megváltoztatná, a cég működése mérföldekkel<br>
effektívebb, biztonságosabb lenne hisz bármilyen dokumentum másolata továbbítható<br>
a rendszerben szereplő felhasználóknak amiről automatikus értesítést kap a célszemély<br>
akinek a dokumentumok el lettek küldve.

## 3. Vágyálom rendszer
A cél egy oylan rendszer konstruálása amely segítségével a cég képes a belső <br>
folyamatait jelentősen gyorsítani, hatákonyabbá tenni. Nem elhanyagolható szempont<br>
a továbbfejleszthetőség. Tehát a rendszer és annak bármilyen állapotától függetlenül<br>
könnyen, gyorsan és olcsón továbbfejleszthető legyen. A rendszernek teljesen <br> 
biztonságosnak kell lennie, hisz a munka hatákonyabbá tételén kívül a biztonság<br>
garantálása.<br>
További célok:
* Biztonságosabb legyen mint a fizikai, automatizálás nélküli üzleti folyamatok.<br> 
* Olyan fájlkezelő rendszerre van szükség amely webböngészőből elérhető.
* Fontos hogy az adatok könnyen nyomon követhetőek legyenek a bizalmas<br>
információk kiszivárgásának elkerülése végett. 
* A felhasználók adatait adatbázisban tárolja a szoftver míg a fájlokat a szerveren<br>
 felhasználók szerint különböző mappákban. 
* Regisztrációkor minden felhasználó User jogosultsággal rendelezzen.
* Felhasználók törlésére csak az adatbázis adminisztátornak lehessen lehetősége.
* Webes védelemről gondoskodik az is hogy helyi lokális szerveren fog futni az alkalmazás
így csak az itt dolgozók férhetnek hozzá.

Ezzel a szolgáltatással leginkább a dokumentáció, papírmunka menedzselése válik <br> 
könnyebbé. Mivel egy fájlkezelő szolgáltatásról beszélünk ezért más egyéb dolgokra<br>
is használható ahol értelmezhető fájlokkal való munka.

## 4. Jelenlegi üzleti folyamatok


## 5. Igényelt üzleti feladatok

* Regisztráció:<br>
  A Regisztrációhoz egyedi és valós email-cím,egyedi felhasználónév továbbá<br>
  jelszó és jelszó megőrősítést adjon meg a felhasználó amellyeknek mindegyikét<br>
  validálni is kell hogy helyesen töltette-e ki az adatokat amenyiben nem<br>
  megfelelő hiba üzenet jelenik meg amenyiben helyes át irányítjuk a bejelentkezésre.

* Bejelentkezés:<br>
  A már regisztrált felhasználóknak felhasználónevet és jelszót kell megadjanak<br>
  a bejelentkezéshez ha a regisztrációkor megadott adatoknak megfelelően <br>
  töltötték ki az adatokat át irányítjuk a felhasználót a fájl lista oldalra <br>
  egyébként a megfelelő hiba üzenetet jelenítjük meg számára.


* Fájlok megjelenítése:<br>
  A felület csak a bejelentkezett felhasználók számára elérhető Egy listában <br>
  jelenik meg a tárolt fájlok neve módosítási dátuma mérete.A lista továbbá<br>
  rendezhető alapértelmezetten név szerint rendezett és öttösével jelenik meg egy lapon<br>

* Fájl keresése:<br>
  A felhasználónak fájl név megadásával lehetősége van fájlok keresésére a listából

* Fájl feltöltés:<br>
  A felhasználó saját gépéről való tallózásal tud új fájlokat feltölteni amely <br>
  sikeres feltöltés után a listában jelenik meg és eltárolódik a megfelelő helyen.

* Fájl törlése:<br>
  A felhasználó a listából tud fájlokat törölni.Törlés után a fájl törlődik<br>
  mind a listából mind a tárolási helyről és az adatbázisból.

* Fájl letöltése:<br>
  A felhasználó a listából kiválasztott fájlt letölti a saját számítógépére. 

* Fájl küldése:<br>
  A felhasználó tud  a listából kijelöléssel egy,vagy egyszerre több fájlt<br>
  tövábbítani más felhasználóknak ehhez meg kell adniuk a címzett felhasználónevét.<br>
  Sikeres küldéskor a fájlokról a másik felhasználó másolatot kap. Az ilyen<br> 
  módon kapott fájlokat is ugyanúgy lehet látni és kezelni, mint a saját maga<br>
  által létrehozott fájlokat. A másolatokról láthatónak kell lennie,<br> 
  hogy ki küldte át. A fogadó felhasználónak a saját email címére email<br>
  értesítést kell kapnia az átküldött fájl(ok)ról, amiben szerepel a fájlok<br>
  neve, és a küldő felhasználó neve sikertelen küldéskor megfelelő hiba üzenet<br>
  jelenik meg a küldő felhasználó számára.

* Szöveges fájl készítése:<br>
  A felhasználó tud új szöveges fájlt létrehozni és az oldalon keresztül<br>
  felvinni a tartalmát.Ezek a fájlok mentés után ugy úgy tárolódnak mint<br>
  a feltöltött fájlok és megjelennek a listában és végre hajthatóak rajta<br>
  a műveletek.Megadhatóak azonos névvel is fájlok


* Szöveges fájl szerkesztése:<br>
  A felhasználó mind a feltöltött a fogadott és a felületen készített szöveges<br>
  fájlokat eléri és tudja szerkeszteni azok tartalmár mentés után visza kerül<br>
  a listába az új módosítási dátummal

* Felhasználó név módosítás:<br>
 A felhasználó módosíthatja a felhasználó nevét amennyiben az új felhasználó név<br>
 helyes frissül az adatbázisban ellenkező esetben a megfelelő hiba üzenetet jelenik meg.

* Jelszó Módosítás:<br>
 A felhasználó módosíthatja a jelszavát amennyiben az új jelszó helyes frissül <br>
 az adatbázisban ellenkező esetben a megfelelő hiba üzenetet jelenik meg.

* Kijelentkezés:<br>
  A felhasználót kijelentkezéskor át irányítjuk a bejelentkezésre.


### 6. Fogalom szótár
* regisztrált felhasználó: Az a felhasználója a szolgáltatásnak, amely a regisztrációs folyamatot<br> 
sikeresen végrehajtotta ezáltal bekerült a rendszerbe és az adatait használva sikeres bejelentkezést tud végrehajtani.
* bejelentkezés: Az a folyamat amely után a regisztrált felhasználó elérheti a webszolgáltatás által nyújtott funkciók lényegi részét. 