# Fájlkezelő

## 1. Vezetői összefoglaló
A projekt célja egy magáncégen belüli használatra megfelelő fájlkezelő program<br>
létrehozása. Jelenleg a cégen belül nem üzemel elektronikus rendszer a fájlok <br>
tárolására, így a program elkészítése a nulláról fog kezdődni. Elvárás a programmal <br>
szemben, hogy az alkalmazottak tudjanak saját felhasználót létrehozni és a tevékenységeik <br>
ehhez a profilhoz legyenek kötve. A fájlokkal egy átlátható és könnyen kezelhető felületen<br>
lehessen a következő műveleteket végrehajtani: megtekintés, keresés, feltöltés, letöltés,<br>
törlés és küldés különböző felhasználók között. Ezek mellet elsődleges a dokumentumok<br>
biztonságának biztosítása, ne lehessen megfelelő hozzáférés nélkül a fájlokat elérni és <br>
az esetleges adatlopás ellen is védekezni kell. Összességében szeretnénk elérni a <br>
rendszer modernizálásával, hogy a cégen belüli fájlok átvitele gyorsabb és átláthatóbb legyen. <br> 

## 2. Jelenlegi helyzet
A cég egy gyár, ahol szorosan egymásra épülő gyártási folyamatok vannak így <br>
a dokumentáció kiemelt figyelmet igényel, hisz egy nagy cégnél több részlegből<br>
állhat a gyártási folyamat. Ezek a részlegek egymással kommunikálnak hosszú<br>
dokumentációk, képek, tervrajzok és hanganyag formájában is, illetve ezeknek a <br>
kommunikációs folyamatoknak is nyomonkövethetőnek kell lennie. A cégnél a dokumentációs<br>
munkálatok nagyrészt papír alapon működnek, amelyek rendkívül lassúak pedig az<br>
internet és a hálózatok megjelenésével jelentősen lehet gyorsítani a manuálisan <br>
elvégezhető munkák nagy részét, ez az egyik fő ok amiért szeretnénk forradalmasítani<br>
a gyár működését. Ezen kívül, amikor a dokumentációs és egyéb a gyártási folyamathoz<br>
szükséges anyagok leadása/átvitele történik az illetékes személyhez/személyekhez<br>
mindkét félnek jelen kell lennie az átadásnál mert más esetben nyomonkövethetetlen<br>
lenne a dokumentumok áramlása, ami további problémákhoz vezethet. Ezek könnyen <br>
automatizálható folyamatok, amelyek további időt vesznek el a tényleges munkaidőből<br>
azaz csökken a gyár effektív munkavégzése. Ezek mellett az emberi hiba esélye is<br>
sokkal nagyobb hisz fennáll a veszélye, hogy a dokumentációk nem jutnak el időben<br>
a cég többi részlegéhez, esetleges illetékes emberekhez. Biztonsági kockázatok is<br>
fennállnak mert fizikailag a dokumentumokat el kell helyezni valahol, és fennáll<br>
a veszélye, hogy ezekhez illetéktelen személyek is hozzáférnek. Egy professzionális<br>
rendszer ezeket a folyamatokat gyökeresen megváltoztatná, a cég működése mérföldekkel<br>
effektívebb, biztonságosabb lenne hisz bármilyen dokumentum másolata továbbítható<br>
a rendszerben szereplő felhasználóknak, amiről automatikus értesítést kap a célszemély<br>
akinek a dokumentumok el lettek küldve.

## 3. Vágyálom rendszer
A cél egy olyan rendszer konstruálása, amely segítségével a cég képes a belső <br>
folyamatait jelentősen gyorsítani, hatékonyabbá tenni. Nem elhanyagolható szempont<br>
a továbbfejleszthetőség. Tehát a rendszer és annak bármilyen állapotától függetlenül<br>
könnyen, gyorsan és olcsón továbbfejleszthető legyen. A rendszernek teljesen <br> 
biztonságosnak kell lennie, hisz a munka hatékonyabbá tételén kívül a biztonság<br>
garantálása.<br>
További célok:
* Biztonságosabb legyen mint a fizikai, automatizálás nélküli üzleti folyamatok.<br> 
* Olyan fájlkezelő rendszerre van szükség, amely webböngészőből elérhető.
* Fontos, hogy az adatok könnyen nyomon követhetőek legyenek a bizalmas<br>
információk kiszivárgásának elkerülése végett. 
* A felhasználók adatait adatbázisban tárolja a szoftver míg a fájlokat a szerveren<br>
 felhasználók szerint különböző mappákban. 
* Regisztrációkor minden felhasználó User jogosultsággal rendelkezzen.
* Felhasználók törlésére csak az adatbázis adminisztrátornak lehessen lehetősége.
* Webes védelemről gondoskodik az is, hogy helyi lokális szerveren fog futni az alkalmazás
így csak az itt dolgozók férhetnek hozzá.

Ezzel a szolgáltatással leginkább a dokumentáció, papírmunka menedzselése válik <br> 
könnyebbé. Mivel egy fájlkezelő szolgáltatásról beszélünk ezért más egyéb dolgokra<br>
is használható, ahol értelmezhető fájlokkal való munka.

## 4. Jelenlegi üzleti folyamatok

  Jelenleg a cég dolgozói különböző platformokat használnak a szükséges fájlok<br>
megosztásához (pl. Google Drive, Facebook Messenger stb). Ez nem csupán azt jelenti, <br>
hogy nem egységes a dokumentummegosztás, de biztonsági kockázatokat is nagy mértékben <br>
növeli. Harmadik féltől származó üzenetküldési platformokon nagyon könnyű félre<br>
kattintani, ennek következményében olyan személyek juthatnak céges információkhoz, <br>
akik semmilyen kapcsolatban nem állnak a céggel. Ez súlyos következményekhez vezethet, <br>
akár jogi ügy is keletkezhet belőle. Fájlmegosztó platformokon sem nehéz hibázni <br>
apró figyelmetlenség miatt. Nyilvános láthatósági jelzővel ellátott fájlokat és <br>
mappákat bárki megtekinthet esetleg módosíthat is rajtuk, amennyiben rájuk bukkan. <br>
Nyilvánvaló, hogy ezzel is jelentős kockázat jár a cég jövőjére nézve. <br>
  Ezeket és ezekhez hasonló biztonsági réseket hivatott betömni a mi rendszerünk. <br>
A biztonsági szint javulásán kívül a rendszer egységesíti is ezeket a műveleteket. <br>
Ez azt is jelenti, hogy kisebb az esély felhasználók által elkövetett hibákra, <br>
mivel csak olyan funkciók kerülnek implementálásra, amelyek feltétlen szükségesek. <br>
Továbbá, az esetleges hibázás esetén - aminek az esélye minimalizálva van - könnyű <br>
megtalálni és orvosolni a hibát. Ez szintén annak köszönhető, hogy egységes a <br>
rendszer. <br>
  A saját rendszernek természetesen még a felsoroltaknál is több előnye van.<br>
Igény esetén nagyon könnyű és egyszerű további funkciókat lefejleszteni. Fejlesztési <br>
folyamat elkezdése előtt a cég dolgozói tudnak javaslatokat tenni, valamint <br>
folyamatosan tudják kommentálni, mi az ami jól sikerült és, esetleg, melyek azok <br>
a pontok a rendszerben, amelyeken még elvárnak valamilyen módosítást. Így teljesmértékben <br>
a felhasználók igényére szabható a platform. Ez maximalizálja a felhasználóbarát <br>
felület megalkotását és minimalizálja a betanuló időt egy új kolléga bekerülése <br>
esetén. <br>
  A rendszer biztonságát természetesen még az is növeli, hogy kizárólag céges <br>
hálózatról lehet elérni. Ez növel ugyan a biztonságon, viszont egyes esetekben <br>
kényelmetlenséget is okozhat. Ez abban mutatkozik meg, hogy előfordul olyan <br>
eset amikor munkaidőn kívül kell hozzáférni egy dokumentumhoz, azaz nincs lehetőség <br>
közvetlen kapcsolatra a rendszerrel, mivel nem a céges hálózaton vagyunk. Erre a <br>
problémára is van megoldás, még pedig az, hogy először csatlakozunk a céges hálózatra <br>
(erre eddig is volt lehetőség, viszont szükség hiányában nem volt kihasználva) és <br>
csak ezután, már céges hálózaton belül, csatlakozunk a rendszerre. Tehát külső <br>
elérés esetén gyakorlatilag még egy biztonsági falat húzunk. Így, ha a cég egyik <br>
dolgozója külső hálózatról szeretne csatlakozni, akkor egy két lépcsős biztonsági <br>
vizsgálaton kell átesnie. <br>
  Végső konklúzióként arra jutottunk, hogy nyilvánvalóan rengeteg előnnyel jár <br>
egy ilyen rendszer lefejlesztése, továbbá a szükséges erőforrások is rendelkezésre <br>
állnak, és igénybevételük nem jelent produktivitás visszaesést a fejlesztési idő <br> 
alatt sem. Valamint még arra a következtetésre jutottunk, hogy a rendszer elkészülte <br>
pozitív hatással lesz munkára, mivel időt spórolnak majd a felhasználók, ha nem <br>
kell harmadik féltől származó platformokon keresztül kommunikálniuk és kevesebb <br>
időt vesz majd igénybe a láthatóság, valamint jogosultságok kezelése is. <br> 


## 5. Igényelt üzleti feladatok

* Regisztráció:<br>
  A Regisztrációhoz egyedi és valós email-cím, egyedi felhasználónév továbbá<br>
  jelszó és jelszó megerősítést adjon meg a felhasználó amelyeknek mindegyikét<br>
  validálni is kell, hogy helyesen töltette-e ki az adatokat amennyiben nem<br>
  megfelelő hiba üzenet jelenik meg amennyiben helyes át irányítjuk a bejelentkezésre.

* Bejelentkezés:<br>
  A már regisztrált felhasználóknak felhasználónevet és jelszót kell megadjanak<br>
  a bejelentkezéshez ha a regisztrációkor megadott adatoknak megfelelően <br>
  töltötték ki az adatokat át irányítjuk a felhasználót a fájl lista oldalra <br>
  egyébként a megfelelő hiba üzenetet jelenítjük meg számára.


* Fájlok megjelenítése:<br>
  A felület csak a bejelentkezett felhasználók számára elérhető Egy listában <br>
  jelenik meg a tárolt fájlok neve módosítási dátuma mérete. A lista továbbá<br>
  rendezhető alapértelmezetten név szerint rendezett és ötösével jelenik meg egy lapon<br>

* Fájl keresése:<br>
  A felhasználónak fájl név megadásával lehetősége van fájlok keresésére a listából

* Fájl feltöltés:<br>
  A felhasználó saját gépéről való tallózással tud új fájlokat feltölteni amely <br>
  sikeres feltöltés után a listában jelenik meg és eltárolódik a megfelelő helyen.

* Fájl törlése:<br>
  A felhasználó a listából tud fájlokat törölni. Törlés után a fájl törlődik<br>
  mind a listából mind a tárolási helyről és az adatbázisból.

* Fájl letöltése:<br>
  A felhasználó a listából kiválasztott fájlt letölti a saját számítógépére. 

* Fájl küldése:<br>
  A felhasználó tud a listából kijelöléssel egy, vagy egyszerre több fájlt<br>
  továbbítani más felhasználóknak ehhez meg kell adniuk a címzett felhasználónevét.<br>
  Sikeres küldéskor a fájlokról a másik felhasználó másolatot kap. Az ilyen<br> 
  módon kapott fájlokat is ugyanúgy lehet látni és kezelni, mint a saját maga<br>
  által létrehozott fájlokat. A másolatokról láthatónak kell lennie,<br> 
  hogy ki küldte át. A fogadó felhasználónak a saját email címére email<br>
  értesítést kell kapnia az átküldött fájl(ok)ról, amiben szerepel a fájlok<br>
  neve, és a küldő felhasználó neve sikertelen küldéskor megfelelő hiba üzenet<br>
  jelenik meg a küldő felhasználó számára.

* Szöveges fájl készítése:<br>
  A felhasználó tud új szöveges fájlt létrehozni és az oldalon keresztül<br>
  felvinni a tartalmát. Ezek a fájlok mentés után úgy tárolódnak mint<br>
  a feltöltött fájlok és megjelennek a listában és végrehajthatóak rajta<br>
  a műveletek. Megadhatóak azonos névvel is fájlok.


* Szöveges fájl szerkesztése:<br>
  A felhasználó mind a feltöltött a fogadott és a felületen készített szöveges<br>
  fájlokat eléri és tudja szerkeszteni azok tartalmát mentés után vissza kerül<br>
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
* bejelentkezés: Az a folyamat, amely után a regisztrált felhasználó elérheti a webszolgáltatás által nyújtott funkciók lényegi részét.