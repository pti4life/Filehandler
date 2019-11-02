# 1. A rendszer célja:

  Jelenleg a cég dolgozói különböző platformokat használnak a szükséges fájlok<br>
megosztásához (pl. Google Drive, Facebook Messenger stb). Ez nem csupán azt jelenti, <br>
hogy nem egységes a dokumentummegosztás, de biztonsági kockázatokat is nagy mértékben <br>
növeli. Harmadik féltől származó üzenetküldési platformokon nagyon könnyű félre<br>
kattintani, ennek következményében olyan személyek juthatnak céges információkhoz, <br>
akik semmilyen kapcsolatban nem állnak a céggel. Ez súlyos következményekhez vezethet, <br>
akár jogi ügy is keletkezhet belőle. Fájlmegosztó platformokon sem nehéz hibázni <br>
apró figyelmetlenség miatt. Nyilvános láthatósági jelzővel ellátott fájlokat és <br>
mappákat bárki megtekinthet esetleg módosíthat is rajtuk, amennyiben rájuk bukkan. <br>
Nyilvánvaló, hogy ezzel is jelentős kockázat jár a cég jövőjére nézve. Célunk ezt<br>
a kockázatott minimalizálni. <br>
  A projekt célja továbbá egy fájlkezelő-/fájlmegosztó-rendszer fejlesztése, <br>
amely megfellő funkcionalitást implementál a cég dolgozói számára. Alkalmazása <br>
egységesítené a cégen belüli kommunikációt és a szükséges dokumentumok elérhetővé <br>
tételét a megfelelő személyek számára. Ezek mellet elsődleges a dokumentumok<br>
biztonságának biztosítása, ne lehessen megfelelő hozzáférés nélkül a fájlokat <br>
elérni és az esetleges adatlopás ellen is védekezni kell. Összességében szeretnénk <br>
elérni a rendszer modernizálásával, hogy a cégen belüli fájlok átvitele gyorsabb, <br>
átláthatóbb és biztonságosabb legyen. <br>
  A rendszer célja még, hogy alkalmazásával háttérbe szoritsuk a harmadik féltől <br>
származó platformok kommunikációs célra történő használatát, azaz szeretnénk <br>
saját platformunk segítségével elérni, hogy kizárólag azon keresztül történjen <br>
a cégen belüli kommunikáció. <br> 
  Felhasználóknak lehetőségük legyen egymás közötti kommunikációs csatorna létrehozására <br>
a platformon belül. Az adott csatorna lehetőséget nyújt szöveges üzenet küldésére <br>
valós időben, valamint fájlok küldésére és fogadására is. <br>
  A felhasználóknak legyen lehetőségük azon dokumentumok szerkesztésére platformon <br>
belül, amelyekhez megvan a megfelelő jogosultságuk. <br>
  Cél, hogy a felülethez csupán céges hálózatról lehet hozzáférni, viszont szükséges <br>
lehet egyes esetekben, hogy külső hálózatról is elérhető legyen a rendszer. Ennek a <br>
problémának a kiküszöbölésére egyszerű a megoldás. Először is a céges hálózat <br>
elérhető külső hálózatokról is a dolgozók számára. Csatlakozás után, már lehetőség <br>
nyílik a szoftver elérésére is minden felhasználó számára. Ez azt jelenti, hogy <br>
külső csatlakozás esetén minden felhasználónak egy kétlépcsős hitelesítésen kell <br>
átesnie, ami természetesen még biztonságosabbá teszi a platformot. <br>
  Továbbá a célok közé tartozik az is, hogy saját rendszerünk előnyei közé soroljuk <br>
még a teljesmértékben az igényekhez szabott felhasználói felületet, ami ezáltal <br>
nagyon felhasználóbarát is egyben. Ez még azt a pozitívumot is magával vonja, <br>
hogy egy új munkatárs bekerülése esetén nem vesz igénybe sok időt a betanítása. <br>
Későbbiekben akár a betanítási folyamat is automatizálható. <br>
  Jelenleg úgy gondoljuk, hogy a szóban forgó platform lefejlesztésével az összes <br>
említett cél elérhető, valamint a biztonságot is tovább tudjuk növelni, illetve <br>
a dolgozók munkáját egyszerűsíteni, hanem ezeken felül az átfogó produktivitást <br>
is tudjuk növelni, mivel a kollégáknak nem kell időt tölteni azzal, hogy melyik <br>
fájlt hol osszák meg, valamint könnyen tudják elérni munkatársaikat, amennyiben <br>
szükség van az egyes feladatok megbeszéléséhez. <br>

# 2. Projekt terv:

 ### <b>Ütemterv:</b>
  * 2019.10.01 - Fejlesztői csapat megalakul.
  * 2019.11.04- A dokumentáció elkészítése befejezésre kerül, ekkora <br>
    elérhetőek a következő dokumentumok:
    * Követelmény specifikáció 
    * Funkcionális specifikáció 
    * Rendszerterv
  * 2019.11.05 - A fejlesztés elkezdődik.
  * 2019.12.01 - A fejlesztés befejeződik.
  * 2019.12.02 - A tesztelés elkezdődik.
  * 2019.12.10 - Ekorra elérhető a teljes rendszer tesztelve, átadás<br> 
  megegyezés szerint 2019. december 10.-e után.

<b>A projekt teljesen befejezett verzióáig a tesztelést beleértve *35 nap* áll<br>
rendelkezésere.</b>

A projekt ütemtervével kapcsolataban a projekt fejlesztésének kezdete és az <br>
projekt átadása közötti események meghatározás alatt vannak a követelményspecifikációban<br>
említett Agilis szoftverfejlesztési szemlélet miatt. A Sprint-ek időpontja<br>
számossága és a konkrét funkciók, eredmények melyeknek egy sprint alatt kell<br>
elkészülniük még nem körvonalazódtak ki .<br>

Agilis szoftverfejlesztés:
![ ](http://www.inf.u-szeged.hu/~beszedes/teaching/agilspec/Agile_Development_Process.png)


<b>*A projekt mérföldköveinek a sprinteket kell tekinteni!*</b>

### <b>Projekt szerepkörök és felelősségük:</b>

*/A szoftverfejlesztéssel kapcsolatos szerepkörök és felelősségeik/*<br> 

  * <b>Front End fejlesztő:</b> Az alkalmazás kinézetéért felelős szakember<br>
      a front end megjeleníti az információt a felhasználónak.
  * <b>Back End fejlesztő:</b> A szerveren futó logika megírásáért felel pl.:<br>
      Üzleti logika, Adatbázis modell.
  * <b>Szoftvertesztelő:</b> Unit tesztek megírásáért felelős továbbá <br>
      a megrendelő által a szoftverrel szemben támasztott elvárásoknak történő megfelelést vizsgálja.

*/Az Agilis szoftverfejlesztéssel kapcsolatos szerepkörök és felelősségeik[Scrum]/*<br>

  * <b>Scrum master:</b>A Scrum főbb szerepkörei a „Scrum Master”, aki a <br>
  folyamatot felügyeli és a projektmenedzserrel ellentétben, a csapat önálló<br>
  munkavégzését edzőként segíti.
  * <b>Product Owner(terméktulajdonos):</b>A projektben érdekelt döntéshozókat<br>
      képviseli.

<b>Sprint:</b> A csapatban megegyezés szerint 2 hét egy sprint.<br>
Lényege: A csapatunk egy működő szoftveregységet hoz létre. A futam során<br>
megvalósítandó funkciók a „Backlog”-ból kerülnek ki, ami az elvégzendő munka<br>
magas szintű követelményeiből álló, fontossági sorrendbe állított lista ami a<br>
projektmenedzsmentet segítő szoftverben van deklarálva(Trello-ban).
 

A projekt elkészítésért <b>4</b> kiváló junior programozó felelős:
* Kállai Roland
* Szabó Ferenc
* Hidi Erik Zoltán
* Szűcs Gergő
 
 ### <b>A szerepkörökhöz tartozó felelősségek a specifikálása:</b><br>
 *A szerepkörök között átfedések lehetnek a munka során.*

* Szűcs Gergő: A design, illetve front-endért felelős személy. Az ő feladata<br>
a megfelelő user-interface létrehozása.
* Szabó Ferenc: A perzisztencia osztályok létrehozása, a szükséges adatbázis<br>
műveletek implementálása továbbá az alkalmazás architektúrájának, struktúrájának<br>
a megtervezése.(Back-end)<br>
* Hidi Erik: Az alkalmazás üzleti logikájának egy részének implementálása.(Back-end)<br>
* Kállai Roland: Az alkalmazás üzleti logikájának implementálása illetve <br>
 szintén az alkalmazás struktúrájának tervezése.(Back-end)

# 3. Üzleti folyamatok modellje:
* **Üzleti Szereplők:**
    * A cég alkalmazottai: A szerepkör a webes felületen történő            regisztrációval<br>
      jön létre Sikeres regisztrációt követően Felhasználói jogosultságot<br>
      kap majd képessé válik bejelentkezni a fájlfeltöltő felületre<br>
*   **Támogatandó üzleti folyamatok:**
    * Felhasználó azonosítás:<br>
      A felhasználó beviszi a nevét és jelszavát a webes felületre majd <br>
      a program megvizsgálja hogy létezik-e ilyen felhasználó az adatbázisban<br>
      amenyiben igen a jelszóra használja a megfelelő titkosítási algoritmust<br>
      és megvizsgálja hogy a felhasználóhoz tárolt jelszó megegyezik-e a <br> 
      bevittel amennyiben igen sikeresen tovább jut a fájl lista felületre<br>
      ellenkező esetben pedig a megfelelő hiba üzenetet kapja a felhasználó.

      ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/login.jpg)
    * Felhasználó Regisztrálás:<br>
      A felhasználónak ki kell töltenie a regisztráláshoz egy regisztrációs <br>
      űrlapot kell kitölteni bizonyos megkötésekkel. Az űrlap kitöltéséhez a<br> következő adatokra van szükség:
      
      |Adat|Megszorítás|
      |----|-----------|
      |Felhasználónév|Legalább 3 karakter hosszú és egyedi|
      |Jelszó|Legalább 3 karakter hosszú|
      |Jelszó megerősítés|Megegyezik a Jelszóval|
      |email|Valós email formátum és egyedi|  

      A program feldolgozza az adatokat amennyiben minden megszorításnak<br>
      eleget tesz feltölti az adatokat az adatbázisba ami után a felhasználó<br>
      már be tud jelentkezni a felületre ellenkező esetben a megfelelő<br>
      hiba üzenetet kapja  felhasználó.

      ![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/Regisztr%C3%A1ci%C3%B3.jpg)
    * Felhasználó módosítás: <br>
      A felhasználó módosíthatja felhasználó nevét valamint jelszavát <br>
      Az új adatnak is meg kell felelnie a megszorításoknak ammenyiben a <br>
      megfelel az adatok frissülnek az adatbázis és vissza jelzést kap a <br>
      felhasználó ellenkező esetben a megfelelő hiba üzenetet.

    * Fájlok feltöltése:<br>
      A felhasználó képes fájlok feltöltésére a kiválasztott fájlt a szereveren<br>
      tároljuk és fáljra vonatkozó adatokat pedig az adatbázisban beleértbe a <br>
      felhasználó azonosítóját.

    * Fájlok listájának megjelenítése:<br>
      Az összes felhasználóhoz rendelt fájlt kiolvasódik az adatbázisból<br>
      és egy listában jelenik meg a főmenüben oldalanként ötösével.<br>
      Megjelenik a listában a fájl neve,módosítási dátuma,mérete <br>
      opcionálisan a küldő felhasználó neve valamint az elérhető műveletek.

    * Fájlok törlése:<br>
      Ha a fájlok listája nem üres a felhasználó a kiválasztott fájlt a <br>
      törlés gombra kattintva törli az adatbázisból valamint a szerverről<br>
      így a felhasználó nem éri el többé.

    * Fájlok letöltése:<br>
      Ha a fájlok listája nem üres a felhasználó a kiválasztott fájlt <br>
      le tudja tölteni a szerverről az általa használt eszközre.

    * Fájl keresés:<br>
      A felhasználó a fájl nevének megadásával keresni tud a hozzá rendelt<br>
      fájlok között.

    * Fájlok küldése<br>
      A felhasználó képes fájlok küldésére egyesével vagy akár egyszerre többet<br>
      is ehez szükség van a címzett felhasználó nevére.A kiválasztott fájlokról<br>
      másolat készül a címzett részére a fájlokra vonatkozó adatokat tároljuk az<br>
      adatbázis beleértbe a címzett azonosítóját.A címzett fájl listákába bekerül<br>
      amely jelzi  küldő felhasználó nevét.

    * Szövegesfájl létrehozása:<br>
      A felhasználónak lehetősége van Szöveges típusu fájlok létrehozására<br>
      egy külön felületen ehez meg kell adni a tetszés szerint fájl nevét és<br> tartalmát majd a mentésre kattintva ezeket a fájlokat is ugyan úgy <br>
      tároljuk a szerveren és az adatbázisban a fájl listába bekerülenek ezek<br>
      a fájlok is.

    * Szövegesfájl szerkesztés:<br>
      Szöveges típusu fájloknál a felhasználónak lehetősége van a fájlok <br>
      tartalmának és nevének módosítására. ilyenkor frissülnek az adatok<br>
      minda szerveren és az adatbázisban mind a fájl lista felületen.

    * Email küldés:<br>
      A felhasználó amikor fájlt kap emailt kap a regisztráláskor megadott<br>
      email címére amely tartalmazza a fogadott fájlt nevét  a küldés<br>
      dátumát valamint a küldő felhasználó nevét.

* Üzleti entitások 
  * User: Regisztrálás során vihető fel az adatbázisba segítségével a         felhasználók képesek végrehajtani az üzleti folyamatokat. Bejelentkezni   csak regisztrált userel lehetséges. Az objektum váza:

    | USER | 
    |  -   |
    | long(id)|
    | String(username)|
    |String(password)|
    |String(email)|

  * File: A felhasználókhoz tartozik a felhasználók hozhatnak létre vagy<br>
    tölthetnek fel és kaphatnak más felhasználóktól. Az objektum váza:

    | File |
    |   -  |
    |long(fileId)|
    |long(userId)|
    |long(senderId)|
    |String(FileName)|
    |String(fileType)|
    |int(fileSize)|
    |Date(modifyDate)|

# 4. Követelmények:
# 5. Funkcionális terv:
# 6. Fizikai környezet:
Az alkalmazás Java platformon lesz megvalósítva, a végeredmény egy webalkalmazás <br>
ami alatt egy Apache Tomcat 9.0-ás Java servlet fog futni. Mivel a Java platformfüggetlen<br>
ezért bármilyen opercáiós rendszeren futhat a szerver, de a stabilitás biztosítása<br>
az ügyfeleinknek a cégünk egyik legfontosabb elve ezért linuxon fog futni a<br> 
webalkalmazás. Tekintve, hogy a termékünket maximálisan egy időben 100-200 <br>
felhasználó fogja használni előreláthatólag, ezért a következő hardveren fogjuk<br> 
biztosítani a szerver működését:<br>
*[Feltételezhető, hogy növekszik a felhasználó bázis, ezért kicsivel erősebb szervergépen<br>
fut a minimálisnál]*<br>
* ### Hardver:
    * <b>gép típusa:</b> DELL Precision munkaállomás s1366 processzor foglalat (két processzoros rendszer)
    * <b>Memória:</b> 8GB DDR3-as memóriával
    * <b>Videokártya:</b>  Quadro 2000 1GB DDR3 128bit (DirectX 11, Open GL 4.4, Shader Model 5.0)
    * <b>Processzor:</b> 2d Xeon E5620 2x 8x2400MHz s1366 (4 mag, 8 szál) 12M Cache, 2.40 GHz, 5.86 GT/s Intel® QPI
    * <b>Rendszer:</b> Ubuntu linux
 

Hálózati kapcsolatot igényel a szoftverrendszer, hisz web alapú alkalmazás, de<br>
bármely csomag amely internetszolgáltató cégeknél elérhető, megfelelő<br>
*(akár a legkisebb internetcsomag is)* a lényeg, hogy folyamatos legyen az<br> 
internetkapcsolat. Ahhoz, hogy a a kész szoftvert számítógépen használhassuk<br>
szükség van egy Windows vagy macOS vagy Linux operációs rendszert futtató számítógépre<br>
és egy feltelepített webböngészőre<br>
* ### Ajánlott böngészők:
    * Microsoft Edge
    * Firefox
    * Opera
    * <b>Google Chrome - Kiemelten ajánlott</b>
    * <b>Chromium - linux alatt kiemelten ajánlott</b>
    * <b>Safari - MacOS alatt kiemelten ajánlott</b>
* ### Nem ajánlott böngészők:
    * Internet expoler


Mivel maga az alkalmazás is egy open-source produktum produktum ezért nem tartalmazhat<br>
nem open-source függőségeket. Azaz a fejlesztés során nincsenek semmiféle vásárolt<br>
szoftver komponensek vagy külső rendszer(ek).

A megvalósítás végző csapat a fejlesztési folyamat során az alábbi ingyenes, nyílt forráskódú<br>
fejlesztői környezeteket használja: <br>
* Intellij Community Edition
* Apache Netbeans
* Eclipse 

Ezek a fejlesztői környezetek rendelkeznek "Intellisense" bővítménnyel ami lehetővé<br>
teszi a gyors és rugalmas fejlesztést és számos egyéb a fejlesztést segítő feature-t támogatnak.<br>

Az alkalmazás a világ egyik legtámogatottab keretrendszer segítségével azaz a Spring MVC<br>
keretrendszerrel.


# 7. Absztrakt domain modell:

  A projekt absztrakció szempontjából három részre osztható fel:
* Felhasználó
* Szerver
* További felhasználók

  Kapcsolatukat a szerver biztosítja.

![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/Untitled_Diagram.svg)

# 8. Architekturális terv:
Az architekturális minta a Modell-View-Controller sémára fog épülni kisebb<br>
módosításokkal amelyeket a SpringMVC keretrendszer bíztosít számunkra.<br>

MVC komponensek:
*   Modell:
    A modell osztályokat egyszerű POJO osztályok fogják reprezentálni ebből <br>
    következik hogy a modell osztályok nem tartalmaznak üzlei logikát csupán <br>
    olyan objektumok vázát amelyeket az adatbázisban tárolunk és mivel csapatunk<br>
    JPA hibernate által implementált megoldásokat fog használni így ennek megfelelően<br>
    a modell osztályaink egyben entitás osztályokat is fogják jelenteni számunkra<br>

* Perzisztencia Osztályok:
    minden modellhez tartozik egy úgy nevezett Dao osztály amely biztosítsa<br>
    számunkra az adatbázis kapcsolatot és az adatbázis műveleteket ezeket a <br>
    a Dao osztályokat egy repository nevű packageben fog implementálásra kerülni<br>
    Adatbázis műveletek:
    * Új adatok feltöltése az adatbázisba.
    * Már meglévő adatok módosítása.
    * Adatok lekérdezése az adatbázisból.

* Controller Osztályok:
    Programunkban a Controller osztályok a Spring által biztositott Contorller <br>
    megnevezésű beanek amelyek kapcsolatban állnak  a nézettel és fogadják<br>
    és feldolgozzák a felhasználó által bevitt adatokat valamint a felhasználó<br>
    által kért műveleteket valamint kapcsolatban áll az a perzisztencia<br>
    osztályokkal.Számunkra ezek az osztályok fogják tartalmazni az üzleti logikát<br> 
    valamint felelősek az adatok kijutatásért a nézet rétegre és a megfelelő nézet<br>
    betöltése is a ennek a rétegnek a feladata.

* Nézet:
    A nézet réteg felelőr a felhasználói felület megjelenítéséért valamint<br>
    a controller rétegtől kapott információk felhasználó elé tárásáért.

Mivel az MVC megoldásai rétegenként könnyen bővithetőek ezért a szoftver<br>
könnyen tudja kezelni az esetleges változtatásokat mind a kész termék <br>
elkászülése után mind a fejlesztés ideje alatt dinamikusan tud alkalmazkodni<br>
a megrendelő igényeihez legyen szó a dizájn beli változtatásáról vagy pedig<br>
az adatbázis kapacitásának növeléséről megfelelő errőforások birtokában<br>
könnyen növelhető mivel a JPA hibernate által implementált megoldásait fogjuk<br>
a rendszer létre hozásánál használni amely révén a kapacitás növelése rendkivül<br>
egyszerű feladat.Továbbá az MVC 3 rétegű architekturális minta követése miatt<br>
a külömböző rétegek egymástól jól elkülönítettek így a kód a jövőben is könnyen<br>
karbantartható lesz és új funkciókal való bővítése is egyszerűen implementálható lesz. 

Csapatunk  a biztonsági funkciókhoz a Spring által nyújtott Spring <br>
Security keretrendszert fogja használni. A Spring Security egy könnyedén <br> 
testreszabható hitelesítést és hozzáférést-vezérlő keretrendszer.Ez a gyakorlatban<br>
használt szabvány Spring alapú alkalmazásokhoz. Spring Security valódi előny abban<br>
rejlik , hogy mennyire könnyen bővíthető az egyéni követelményeknek való<br>
megfelelés érdekében.


# 9. Adatbázis terv:
Logikai adatmodell:

A szoftver Oracle SQL adatbázist fog használni, a felhasználók azonosítására illetve<br>
a fájlok és az egyéb a szoftver működéséhez szükséges adatok tárolására.<br>
Az adatbázis 2 táblából fog felépülni:<br>
* Users
* Files

táblákból amelyek *Egy-a-többhöz* kapcsolatban állnak egymással.<br>
Azaz a *Files* tábla minden rekordjához tartoznia kell egy a *Users*<br>
táblából vett elsődleges kulcsnak ami egy felhasználót azonosít.

Az webalkalmazás adatbázishoz való kapcsolódásához a Hybernate<br> 
keretrendszer megoldásait fogjuk használni az adatbázis műveletekhez<br>
mert egy jól kiforrott, nagy felhasználóbázissal rendelkező keretrendszerről<br>
van szó.<br>

  Az okok, ami miatt a Hibernate keretrendszrre esett a választás: <br>
* A keretrendszer magához az adatbázishoz csatlakozik és HQL-t használ a lekérdezések <br>
kivitelezéséhez.
* Az objektumok mapelését mi tudjuk konfigurálni a "Hibernate configuration XML" fájl <br>
segítségével.
* Az úgynevezett impedancia eltérések előfordulása esetén a Híbernate többynire <br>
külső beavatkozás nélkül tudja elhárítani a hibát. <br>
* Adatbázis táblázat változás esetén minimálisan kell a kódot változtatnunk. <br>
* Minimális a kódduplikáció (ellentétben a JDBC-vel) <br>
* "try-catch" blokkok hanyagolhatóak.
  A fenti okokból kifolyólag nyilvánvalóvá válik, hogy a Hibernate sok szempontból <br>
nagyon jó választás. Nem csak a teljesítményt növeli, de fejlesztési időt is nagy <br>
mértékben csökkenti, ezáltal kevesebb erőforrást igényel a fejlesztési folyamat. <br>

### Adatbázis modell:<br>
![ ](https://github.com/pti4life/Filehandler/blob/master/Dokumentumok/K%C3%A9pek/database.jpg)

* ### *Users* tábla:
    * <b>ID:</b> A felhasználót azonosító *int* típusú mező.
    * <b>name:</b> A felhasználó nevét tároló *varchar* típusú mező.
    * <b>username:</b> A felhasználó felhasználónevét tároló *varchar* típusú mező.
    * <b>password:</b> A felhasználó hashelt jelszavát tároló *varchar* típusú mező.
    * <b>email:</b> A felhasználó e-mail címét tároló *varchar* típusú mező.
* ### *Files* tábla:
    * <b>ID:</b> Egy fájlt azonosító *int* típusú mező.
    * <b>user_id:</b> Azon felhasználó *int* típusú ID mezője akinek a tulajdonában áll a fájl.<br> 
    Ez szolgáltatja a kapcsolatot a két tábla között *[Külső kulcs]*.
    * <b>name:</b> A fájl nevét tároló *varchar* típusú mező.
    * <b>type:</b> A fájl típusát tároló *varchar* típusú mező.
    * <b>size:</b> A fájl méretét bájtban, tartalmazó *int* típusú mező.
    * <b>modif_date:</b>: A fájl módosítási dátumát tartalmazó *timestamp* típusú mező.<br>
    Alapértelmezetten a feltöltöltés időpontját tartalmazza.
    * <b>sender_id</b>: Azon felhasználót azonosító *int* típusú ID mező aki a fájlt küldte a<br>
    *user_id* mezőben lévő ID-val rendelkező felhasználónak. Ha a felhasználó saját magának<br>
    hozta létre a fájlt vagy töltötte fel akkor null az értéke.

# 10. Tesztterv:

  A platform megfelelő müködéséhez elengedhetetlenek a tesztesetek kipróbálása. <br>
Törekedni kell minél nagyobb lefedetségre kódtesztelés szempontjából. Üzleti <br>
logikát implementáló függvények szükségszerűen JUnit tesztek segitségével kreülnek <br>
tesztelés alá. Ezen kívül további manuális teszt vár a programra élesítés előtt. <br>
Tesztesetek megtekinthetőek az alábbi táblázatban:

| Sorszám | Teszt leírása | Elvárt viselkedés |
|---|---|---|
| MT01 | A program elindítása | A program sikeresen induljon el|
| MT02 | A regisztrációs felület elérése | A felület legyen elérhető |
| MT04 | A regisztrációs felület kipróbálása helyes adatokkal | Sikeres regisztráció |
| MT05 | A regisztrációs felület kipróbálása helytelen adatokkal | Sikertelen regisztráció, hiba jelzése |
| MT06 | A regisztrációs felület kipróbálása létező felhasználói adatokkal | Sikertelen regisztáció, hiba jelzése |
| MT07 | A bejelentkező felület elérése | A felület legyen elérhető |
| MT08 | A bejelentkező felület kipróbálása helyes adatokkal | Sikeres bejelentkezés |
| MT09 | A bejelentkező felület kipróbálása helytelen adatokkal | Sikertelen bejelentkezés, hiba jelzése |
| MT10 | A bejelentkező felület kipróbálása nem létező felhasználói adatokkal | Sikertelen bejelntkezés, nem létező felhasználó jelzése |
| MT11 | Üzenet küldése létező felhasználónak | Sikeres üzenetküldés, 2. felhasználó megkapja az üzenetet |
| MT12 | Üzenet küldése nem létező felhasználónak | Sikertelen üzenetküldés, hiba jelzése |
| MT13 | Fájl letöltés megfelelő jogosultsággal | Sikeres lwtöltés |
| MT14 | Fájl letöltés megfelelő jogosultsággal nélkül | Sikertelen letöltés, jogosultság hiányának jelzése |
| MT15 | Fájl szerkesztése megfelelő jogosultsággal | Sikeres szerkesztés |
| MT16 | Fájl szerkesztése megfelelő jogosultsággal nélkül | Sikertelen szerkesztés, jogosultság hiányának jelzése |
| MT17 | A platform elérése céges hálózatról | Sikeres elérés |
| MT18 | A platform elérése külső hálózatról | Sikertelen elérés, hiba jelzése |
| MT19 | A platform elérése külső hálózatról céges hálózaton keresztül | Sikeres elérés |
| MT20 | Felhasználói adatok módosítása a megszorításokat kielégítve | Sikeres módosítás |
| MT20 | Felhasználói adatok módosítása helytelen adatokkal | Sikertelen módosítás, hiba jelzése |
| MT21 | Fájl törlése megfelelő jogosultsággal | Sikeres törlés |
| MT22 | Fájl törlése megfelelő jogosultsággal nélkül | Sikertelen törlés, jogosultság hiányának jelzése |
| MT23 | Fájl keresés létező felhasználónév szerint | Sikeres keresés, találatok megjelenítve |
| MT25 | Fájl keresés nem létező felhasználónév | Sikeres keresés, nemlétező felhasználónév jelzése |
| MT26 | Fájl küldése létező felhasználónak | Sikeres fájlküldés, 2. felhasználó megkapja az üzenetet és emailt |
| MT27 | Fájl küldése nem létező felhasználónak | Sikertelen fájlküldés, hiba jelzése |

  A manuális tesztek elvégzését a fejlesztők végzik el egymástól függetlenül.
Megszorítások a manuális tesztek elvégzésével kapcsolatban:
* Minden tesztet legalább három alkalommal kell elvégezni.
* Amennyiben a teszt megkövetel valamilyen input információt, úgy ennek az <br>
információnak minden alkalommal változnia kell. <br>
* Amennyiben valamelyik teszt eset során a szoftver nem az elvárt viselkedést <br>
produkálja, úgy jegyjőkönyv készítése <b>KÖTELEZŐ!</b>. A jegyzőkönyv magába kell, <br>
hogy foglalja a teszteset kódját, az input adatokat (amennyiben létezik) és a <br>
viselkedés pontos leírását. Képernyőfelvételek csatolása nem kötelező, egyes <br>
esetekben ajánlott. Ez az eseti jegyzőkönyv nem helyettesíti az átfogó tesztelési <br>
jegyzőkönyvet. Azt mindenképp külön kell elkészíteni, valamint feltölteni a megfelelő <br>
helyre. <br>
* Minden tesztelő személy a teszt elvégzése során tesztelési jegyzőkönyvet kell, hogy <br>
készítsen. Az ajánlott formátum jegyzőkönyv számára egy táblázat, hasonló a fentihez. <br>
A harmadik oszlopban kell különbözniük: "Elvárt viselkedés" helyett "Valós viselkedés". <br>
A harmadik oszlopban kétféle eredmény szerepelhet: "Sikeres teszt" vagy "Sikertelen <br>
teszt". Amennyiben sikertelen volt a teszt, abban az esetben a "Sikertelen teszt" <br>
jelzőn kívül be kell linkelni a sikertelen teszt jegyzőkönyvét is, amely megszorításait <br>
fentebb már olvashattuk. <br>

# 11. Telepítési Terv:
  
  Egy böngészőből elérhető rendszerről beszélünk, így a telepítés csupán <br>
a szerver környezetben szükséges. Ezt a telepítést a fejlesztők végzik el <br>
különböző keretrendszerek segítségével. <br>

# 12. Karbantartási Terv:

  A platform nem igényel jelentős karbantartást. Elavult, valamint nem releváns <br>
fájlok törlése elengedhetetlen, azonban ezeket a müveleteket a megfelelő jogosultsággal <br>
rendelkező felhasználók kivitelezhetik bármikor, így ez nem igényel külsős <br>
segítségét. <br>
  Funkcionalitás bővítése esetén merülhetnek fel kompatibilitási problémák, ezen <br>
problémák elkerülésének érdekében bővítés esetén precízen kell megtervezni az <br>
új verziókat. Új releváns tesztek létrehozása és futtatása is szükszéges lehet <br>
egyes esetekben. <br>
  Karbantartást megkönnyítő funkcióként tervben van a jövőre egy olyan funkció, <br>
amely a régi (régi konkrét jelentését később tudjuk definiálni, amikor figyelembe <br>
vesszük a felhasználók szokásait) nemhasznált fájlok észlelése esetén jelez a <br>
felhasználónak a platformon, valamint e-mailt küld. Többszöri jelzés ignorálása <br>
esetén a rendszer jelez egy Admin felhasználónak, aki el tud járni az ügyben. <br>
  Lehetőség lesz továbbá a fájlok "védett" cimkével történő megjelölésére. Az <br>
ilyen jelzővel ellátott fájlokat nem fogja vizsgálni a platform, így ezek miatt <br>
a felhasználók nem kapnak majd értesítést. Ilyen cimkével kizárólag Admin felhasználók <br>
tudnak majd fájlokat ellátni. <br>