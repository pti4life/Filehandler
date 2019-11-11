# Fájlkezelő

## 1. Vezetői összefoglaló

  A projekt elsődleges célja egy fájlkezelő-/fájlmegosztó-rendszer fejlesztése, <br>
amely megfelelő funkcionalitást implementál a cég dolgozói számára. Alkalmazása <br>
egységesítené a cégen belüli kommunikációt és a szükséges dokumentumok elérhetővé <br>
tételét a megfelelő személyek számára. Sajnos jelenleg nem üzemel olyan belső <br>
rendszer a cégnél, amely ezeket a feladatokat el tudná látni, viszont már jelentős <br>
igényt látunk egy ilyen platform létrehozására. <br>
  A szoftver lehetőséget kell, hogy biztosítson új felhasználó létrehozására. A <br>
felhasználók számára szükséges jogokat adni, tehát nem fér hozzá mindenki minden
információhoz, dokumentumhoz. Minden felhasználó csak a számára releváns dokumentumhoz <br>
fér hozzá, illetve, amihez jogosultságot kapott. <br>
  Biztosítani kell még a felhasználók számára egy felületet, ahol egyszerűen tudnak <br>
hozzáférni az általuk látható fájlokhoz. A felület segítségével felhasználók <br>
számára lehetőség nyílik megtekinteni/szerkeszteni dokumentumokat, valamint <br>
letölteni és feltölteni fájlokat. Lehetőségük legyen továbbá felvenni a kapcsolatot <br>
más felhasználókkal is. Felhasználók között szintén legyen lehetőség fájlok megosztására, <br>
illetve szöveges üzenet küldésére is. <br>
  Összességében, végső következtetésként annyit tudunk még megjegyezni, hogy a rendszer <br>
számos előnyt hoz majd magával. Többek között egységes kommunikációra és fájlmegosztásra <br>
ad lehetőséget, ezen kívül a biztonságosabbá teszi a céges információk kezelését. <br>
Csökkenti az esélyt a céges adatok kiszivárgására. Rendszer bevezetése után meg <br>
lehet követelni a dolgozóktól, hogy harmadik féltől származó platformokat hanyagolják <br>
és munkaidőben csak a céges felületet használják. <br>
  Igény esetén egyszerűen implementálható plusz funkcionalitás, valamint a meglévő <br>
funkciók könnyen módosíthatók, ha szükséges. <br>

## 2. Jelenlegi helyzet
A projekt funkcióinak kidolgozása ebben a dokumentumban fog megvalósulni a <br>
a követelményspecifikációban megfogalmazottak alapján. Ezek alapján és a <br>
személyes tapasztalatokat figyelembe véve legmegfelelőbb technológiai hátteret<br>
a szerver oldalon a PHP programozási nyelvet találtuk. Továbbá a webalkalmazást <br>
futtató szerver szolgáltatás könnyen és olcsón található, széles a választék mert <br>
egy nagyon népszerű technológiáról beszélünk. A projekthez végig verziókezelő <br>
rendszert fogunk használni, ami lehetővé teszi, hogy a csapat minden tagja, bármikor <br>
bárhonnan akár egyszerre tudjon dolgozni úgy, hogy az egész fejlesztési folyamat nem <br>
omlik össze. A fejlesztést agilis módszertan szerint fogjuk végezni. Ez azt jelenti <br>
Önöknek, hogy a projekt elkészítése Sprintekre lesz bontva és minden Sprint végén <br> 
törekszünk olyan eredményre, amit a felhasználó ki tud próbálni, interaktálni tud vele. <br>
Ennek következtében az ügyfél nem a végén kap egy teljesen kész projektet, hanem fokozatosan <br>
az új funkciókkal ismerkedve kapja kézhez a projektjét. Ennek egyik előnye, hogy<br>
végig követhető a fejlesztés másik előnye, hogy az ügyféllel minden sprint végén<br>
egy meeting keretein validálhatjuk, összefoglalhatjuk az eddig elért eredményeket<br>
 és ha kiderül, hogy félreértés történt vagy másképp szeretne valamit az ügyfél, még<br>
 időben kiderül és apróbb változtatásokat eszközölhetünk a fejlesztés közben.


## 3. Vágyálom rendszer
  A Programot a cég alkalmazottai fogják főképpen használni céges folyamatok<br>
  megkönnyítésére és gyorsítására ezért elsődleges szempont lehet a biztonság<br>
  ezért a program a cég lokális hálózatáról lesz csak és kizárólag elérhető<br>
  ezzel elér, hogy kívülről ne lehessen hozzá férni. A cég szempontjából <br>
  szükség van erőforrásra a fájlok és adatok tárolása miatt továbbá az adatbázishoz<br>
  Megvalósításhoz php-t fog használni backendre és mysql adatbázist a hiszen erre a célra<br>
  ez a legoptimálisabb megoldás. Az sql adatbázis miatt könnyen tudjuk majd<br>
  tárolni mind a felhasználók adatait mind a feltöltött fájlok tulajdonságait.<br>
  A felhasználók web böngészőből tudják majd használni az alkalmazást mindenhol<br>
  ahol elérhető a céges hálózat ez a elkövetkezendő implementációkban<br>
  és a program további változataiban megjelenhet úgynevezett rendszergazdai felület<br>
  amely segítségével a rendszergazda látja a felhasználókat és a hozzájuk tartozó<br>
  fájlokat ez növelné a biztonságot hiszen minden felhasználót nyomon lehet<br>
  követni egy egyszerűen használható felületről további lehetősége a rendszergazdának<br>
  felhasználók törlése elfelejtett jelszó esetén pedig új jelszó adása <br>
  amennyiben valóban jogosult rá a felhasználó. Jelenleg viszont a program<br>
  korábbi változataiban ezeket a lehetőségeket az adatbázis adminisztrátornak<br>
  kell elvégeznie. A felhasználóknak regisztráció után majd bejelentkezéshez<br>
  kötött ez a jelenlegi változatban csak ahhoz lesz kötve, hogy a cég hálózatáról<br>
  lép be a rendszerbe a felhasználó későbbi változatban referencia felhasználóhoz<br>
  lesz kötve a regisztrálás, aki emailt-kap és meg kell erősítenie a regisztrálást<br>
  ezzel kiszűrve a jogosulatlan hozzáféréseket, amely tovább növeli a biztonságot<br>
  A felhasználók egyszerű tallózással tölthetnek fel fájlokat későbbi <br>
  változatban az egyszerűbb és gyorsabb használhatóság miatt elég lesz <br>
  csupán a fájlt behúzni a böngésző ablakba. Sikeres feltöltésnél az adatbázis<br>
  és a szerver megfelelő partíciója tárolja a fájlt. További lehetőséget<br>
  nyújt fájlok törlésére és továbbításra a címzett felhasználó nevének <br>
  megadásával továbbítható egyszerre egy vagy akár több fájl is kijelöléssel<br>
  a címzett másolatot fog kapni a fájlról és ezeket ugyan úgy éri el mint az <br>
  általa feltöltött fájlokat. A címzett email értésest kap, amely tartalmazza <br>
  a küldő felhasználónevét és az elküldött fájl nevét. A program későbbi verziójában <br>
  lehetőség lesz ezeket a fájlokat titkosítva küldeni növelve ez által a biztonságot<br>
  továbbá a felhasználónév írásakor a program automatikus kiegészítéssel<br>
  teszi még könnyebé a felhasználó dolgát. Lehetőség lesz a meglévő fájlok között<br>
  keresni későbbiekben szintén használva az automatikus kiegészítést<br>
  a kereséshez a fájlokat egy listában jelenítjük meg ahol végrehajthatóak<br>
  rajtuk a fent említett műveletek továbbá lehetőség van fájlok letöltésére<br>
  a fájloknál feltűntetjük azok nevét méretét típusát és opcionálisan<br>
  amennyiben a fájlt küldték a küldő felhasználó nevét ezzel növelve a <br>
  nyomonkövethetőséget továbbá a módosítás dátumát is feltűntetjük.<br>
  A felhasználóknak az alkalmazás egy külön lapján van lehetősége szöveges<br>
  formátumú fájlok létrehozására azok tartalmának megírására és szerkesztésére<br>
  az igy készített fájlokat is ugyan úgy tároljuk, mint a hagyományosan<br>
  feltöltött fájlokat. Továbbá lehetőség lesz a felhasználóknak a felhasználónév<br>
  és a jelszó módosítására. A fájl kezelőt nem csak asztali számítógépről lehet<br>
  használni ezért a weboldalnak reszponzívnak kell lennie, hogy azt pc-ről<br>
  táblagépről és telefonról egyaránt használható és át tekinthető legyen.

## 4. Jelenlegi üzleti folyamatok

  Jelenleg a cégnél nem üzemel semmilyen platform, amely egyszerre lehetővé tenné <br>
a munkatársak közötti kommunikációt és fájlmegosztást. Ennek következtében az <br>
alkalmazottak arra vannak kényszerítve, hogy valamely harmadik féltől származó <br>
szoftver segítségével valósítsák meg ezeket a feladataikat. Ez a módszer több <br>
problémát is hordoz magával. Legnagyobb figyelmet egyértelműen a biztonság érdemli. <br>
Mivel az sincs megszabva milyen platformokat használhatnak, akár minden alkalommal <br>
más szoftvert is igénybe vehetnek. Ezáltal nagyon sok csatornán keresztül terjednek, <br>
az esetenként nagyon bizalmas, céges adatok. <br>
  Ezt a problémát elegánsan és egyszerűen old meg egy saját platform lefejlesztése. <br>
Alkalmazásával elég egy csatorna használata, amely egyszerűsíti a dolgozók munkáját <br>
és a biztonságon is jelentősen javít. Ezáltal minimalizálja az adatszivárgás <br>
lehetőségét is. <br>
  Minden felhasználónak rendelkeznie kell jogosultságokkal, ezzel biztosítva, hogy <br>
minden felhasználó csak olyan adathoz férjen hozzá, amelyre feltétlen szüksége <br>
van. <br>
  Felhasználóknak lehetőségük van egymás közötti kommunikációs csatorna létrehozására <br>
a platformon belül. Az adat csatorna lehetőséget nyújt szöveges üzenet küldésére <br>
valós időben, valamint fájlok küldésére és fogadására is. <br>
  A felhasználóknak lehetőségük van azon dokumentumok szerkesztésére platformon <br>
belül, amelyekhez megvan a megfelelő jogosultságuk. <br>
  A felülethez csupán céges hálózatról lehet hozzáférni, viszont szükséges lehet <br>
egyes esetekben, hogy külső hálózatról is elérhető legyen a rendszer. Ennek a <br>
problémának a kiküszöbölésére egyszerű a megoldás. Először is a céges hálózat <br>
elérhető külső hálózatokról is a dolgozók számára. Csatlakozás után, már lehetőség <br>
nyílik a szoftver elérésére is minden felhasználó számára. Ez azt jelenti, hogy <br>
külső csatlakozás esetén minden felhasználónak egy kétlépcsős hitelesítésen kell <br>
átesnie, ami természetesen még biztonságosabbá teszi a platformot. <br>
  A saját rendszer további előnyeiként még meg tudjuk említeni a teljesmértékben <br>
az igényekhez szabott felhasználói felületet, ami ezáltal nagyon felhasználóbarát <br>
is egyben. Ez még azt a pozitívumot is magával vonja, hogy egy új munkatárs <br>
bekerülése esetén nem vesz igénybe sok időt a betanítása. Későbbiekben akár a <br>
betanítási folyamat is automatizálható. <br>
  Jelenleg úgy gondoljuk, hogy a szóban forgó platform lefejlesztésével nem csak <br>
a biztonságot tudjuk tovább növelni, valamint a dolgozók munkáját egyszerűsíteni, <br>
hanem ezeken felül az átfogó produktivitást is tudjuk növelni, mivel a kollégáknak <br>
nem kell időt tölteni azzal, hogy melyik fájlt hol osszák meg, valamint könnyen <br>
tudják elérni munkatársaikat, amennyiben szükség van az egyes feladatok megbeszéléséhez. <br>

## 5. Igényelt üzleti feladatok

* A szolgáltatásnak 3 fő része legyen, a bejelentkezés, regisztráció, és a nyitó oldal<br>
* A felhasználó először a nyitóoldallal találkozzon.

* A rendszer használata előzetes regisztrációhoz kötött, amit helyen kitöltve <br>
a felhasználó bekerül az adatbázisba, így bejelentkezés után használhatja a rendszert. <br>
Sikeres regisztrációhoz szükség van:
    * E-mail címre
    * felhasználónévre
    * teljes névre
    * jelszóra

* Amikor regisztrálunk a megadott adatok validációs folyamaton esnek át.

* A Bejelentkezés felületen a felhasználónak meg kell adnia felhasználónevét<br>
és a hozzá tartozó jelszót. Ilyenkor szintén validációs folyamatok futnak végig <br>
a beírt adatokon:
    * Létezik-e a felhasználó
    * Ha létezik a felhasználó akkor jó-e a jelszava

* A validációs folyamatok megfelelő visszajelzést is adnak eredményükről.<br>
* Sikertelen bejelentkezés esetén egy hibaüzenetet olvashat a felhasználó.<br>
* Sikeres bejelentkezés esetén átirányít a fájl listára és több funkció is <br>
elérhetővé válik a sikeres bejelentkezést követően.<br>


* Fontos, hogy a fájl lista akkor és csak akkor látható ha a felhasználó<br>
  sikeresen bejelentkezett!
* A fájl listán egy táblázatban látható a fájlok:
    * neve
    * mérete
    * módosítási dátuma
    * ki küldte a fájlt
* Egy oldalon 5 fájl jelenjen meg.
* Alapértelmezetten betűrendben.
* A fájl küldésének folyamatának tudnia kell egyszerre több fájlt küldeni, illetve<br>
* A fájlok kijelölése checkbox-ok bepipálásával történik.
* A fájlok küldése egy küldés gomb lenyomásával történik.
* Küldésnél az alábbi validációs folyamatok történnek:
    * Van-e kijelölt fájl? Ha nincs hibaüzenettel tájékoztatjuk a felhasználót.
    * Létezik-e a felhasználó, akinek szeretnénk küldeni? Ha nincs hibaüzenettel<br>
      tájékoztatjuk a felhasználót
    * Sikeres küldés esetén is üzenetet kap a felhasználó. Ekkor az elküldött <br>
    fájl a LEMÁSOLÓDIK és a másolat átkerül az szerveren lévő mappájába. <br>
    és bekerül az adatbázisába is.

* Fájljaink között keresést tudunk végrehajtani. A fájl nevére lehet keresni<br>
  teljes egyezőség szerint.


* Fájlfeltöltést is támogatja a szolgáltatás. A felhasználó kitallózza<br>
a számítógépéről a megfelelő fájlt.<br>
A feltöltés gomb lenyomása után a fájlnév validálásra kerül, nem megfelelő <br>
fájlnév esetén üzenetet kap a felhasználó.<br>
Megfelelő név esetén a fájl eltárolásra kerül a szerveren és az adatbázisban.

* Fájl törlésére is van lehetőség. A felhasználó kiválaszthatja a törlést a <br>
műveleteknél.

* Fájl letöltés: A felhasználó kiválaszthatja a letöltést a fájlhoz tartozó <br> műveleteknél.

* Szöveges fájl létrehozása: A fájl lista oldalán található lesz egy gomb amire <br>
kattintva elérhetővé válik egy felület, ahol a felhasználó szöveges fájlt hozhat létre. <br>
A fájl mentését követően a fájlnév validálásra kerül és ha megfelelő eltárolódik <br>
a szerveren és az adatbázisban is.

* Szöveges fájl szerkesztése: A fájl listában, a fájl műveleteknél elérhető lesz a<br>
"szerkesztés" művelet amire kattintva elnavigál a szöveges fájl létrehozásánál is <br>
használt felületre, csak a fájlt tartalmának helye nem üres lesz, hanem a szerkesztett<br>
fájl tartalma.

* Felhasználónév módosítás: A felhasználónak lehetősége van a profilján felhasználó neve <br>
módosítására. Az alábbi validációs folyamatok futnak le ilyenkor:
    * Ha a felhasználónév már létezik akkor hibaüzenetet kap.
    * Ha a felhasználónév még nem létezik és valid a felhasználónév akkor megváltozik<br>
     amiről szintén értesítést kap.

* Jelszó módosítás: A felhasználó a profil menüpont alatt jelszavát módosíthatja <br>
Ha az új jelszó megfelel a hozzá tartozó validációs folyamatnak akkor a jelszó megváltozik, egyébként nem. Mindkettőről értesítést kap a felhasználó.

## Képernyőtervek

 ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/K%C3%A9perny%C5%91terv/Felhasznaloi%20muveletek.jpg)
<br><br>
 ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/K%C3%A9perny%C5%91terv/F%C3%A1jlkezel%C5%91.jpg)
<br><br>
 ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/K%C3%A9perny%C5%91terv/Regisztr%C3%A1ci%C3%B3.jpg)
<br><br>
 ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/K%C3%A9perny%C5%91terv/Rolunk.jpg)
 <br><br>
 ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/K%C3%A9perny%C5%91terv/bejelentkez%C3%A9s.jpg?raw=true)
<br><br>
 ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/K%C3%A9perny%C5%91terv/F%C3%A1jlk%C3%A9sz%C3%ADt%C3%A9s.jpg)
