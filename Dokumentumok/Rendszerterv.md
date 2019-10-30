# 1. A rendszer célja:
# 2. Projekt terv:
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

