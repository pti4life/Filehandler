
# 1. A rendszer célja:
# 2. Projekt terv:
# 3. Üzleti folyamatok modellje:
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
van szó.
