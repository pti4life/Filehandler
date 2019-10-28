# 1. A rendszer célja:
# 2. Projekt terv:
# 3. Üzleti folyamatok modellje:
# 4. Követelmények:
# 5. Funkcionális terv:
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