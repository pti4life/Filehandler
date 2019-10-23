# Fájlkezelő

## 1. Vezetői összefoglaló

## 2. Jelenlegi helyzet
A projekt funkcióinak kidolgozása ebben a dokumentumban fog megvalósulni a <br>
a követelményspecifikációban megfogalmazottak alapján. Ezek alapján és a <br>
személyes tapasztalatokat figyelembe véve legmegfelelőbb technológiai hátteret<br>
a szerver oldalon a PHP programozási nyelvet találtuk. Továbbá a webalkalmazást <br>
futtató szerver szolgáltatás könnyen és olcsón található, széles a választék mert <br>
egy nagyon népszerű technológiáról beszélünk. A projekthez végig verziókezelő <br>
rendszert fogunk használni ami lehetővé teszi, hogy a csapat minden tagja, bármikor <br>
bárhonnan akár egyszerre tudjon dolgozni úgy, hogy az egész fejlesztési folyamat nem <br>
omlik össze. A fejlesztést agilis módszertan szerint fogjuk végezni. Ez azt jelenti <br>
Önöknek, hogy a projekt elkészítése Sprintekre lesz bontva és minden Sprint végén <br> 
törekszünk olyan eredményre, amit a felhasználó ki tud próbálni, interaktálni tud vele. <br>
Ennek következtében az ügyfél nem a végén kap egy teljesen kész projektet hanem fokozatosan <br>
az új funkciókkal ismerkedve kapja kézhez a projektjét. Ennek egyik előnye, hogy<br>
végig követhető a fejlesztés másik előnye, hogy az ügyféllel minden sprint végén<br>
egy meeting keretein validálhatjuk, összefoglalhatjuk az eddig elért eredményeket<br>
 és ha kiderül, hogy félreértés történt vagy másképp szeretne valamit az ügyfél, még<br>
 időben kiderül és apróbb változtatásokat eszközölhetünk a fejlesztés közben.


## 3. Vágyálom rendszer
  A Programot a cég alkamazottai fogják főképpen használni céges folyamatok<br>
  megkönnyítésére és gyorsítására ezért elsődleges szempont lehet a biztonság<br>
  ezért a program a cég lokális hálózatáról lesz csak és kizárólag elérhető<br>
  ezzel elér hogy kivülről ne lehessen hozzá férni. A cég szempontjából <br>
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
  amennyiben valóban jogosult rá a felhasználó.Jelenleg viszont a program<br>
  korábbi változataiban ezeket a lehetőségeket az adatbázis adminisztátornak<br>
  kell elvégeznie.A felhasználóknak regisztráció után majd bejelentkezéshez<br>
  kötött ez a jelenlegi változatban csak ahoz lesz kötve hogy a cég hálózatáról<br>
  lép be a rendszerbe a felhasználó későbbi változatban referencia felhasználóhoz<br>
  lesz kötve a regisztrálás aki emailt-kap és meg kell erősítenie a regisztrálást<br>
  ezzel kiszűrve a jogosulatlan hozzá féréseket amely tovább növeli a biztonságot<br>
  A felhasználók egyszerű tallózásal tölthetnek fel fájlokat későbbi <br>
  változatban az egyszerűbb és gyorsabb használhatóság miatt elég lesz <br>
  csupán a fájlt behúzni a böngésző ablakba. Sikeres feltöltésnél az adatbázis<br>
  és a szerver megfelelő particiója tárolja  a fájlt.További lehetőséget<br>
  nyújt fájlok törlésére és továbbításra a cimzett felhasználó nevének <br>
  megadásával továbbítható egyszerre egy vagy akár több fájl is kijelöléssel<br>
  a cimzett másolatot fog kapni a fájlról és ezeket ugyan úgy éri el mint az <br>
  általa feltöltött fájlokat. A címzett email értesíst kap amely tartalmazza <br>
  a küldő felhasználónevét és az elküldött fájl nevét. A program  későbbi verziójában <br>
  lehetőség lesz ezeket a fájlokat titkosítva küldeni növelve ez által a biztonságot<br>
  továbbá a felhasználónév irásakor a program automatikus kiegészítésel<br>
  teszi még könnyebé a felhasználó dolgát.Lehetőség lesz a meglévő fájlok között<br>
  keresni későbbiekben szintén használva az automatikus kiegészítést<br>
  a kereséshez a fájlokat egy listában jelenitjük meg ahol végre hajthatóak<br>
  rajtuk a fent említett műveletek továbbá lehetőség van fájlok letöltésére<br>
  a fájloknál feltűntetjük azok nevét méretét típusát és opcionálisan<br>
  amennyiben a fájlt küldték a küldő felhasználó nevét ezzel növelve a <br>
  nyomonkövethetőséget továbbá a módosítás dátumát is fel tűntetjük.<br>
  A felhasználóknak az alkalmazás egy külön lapján van lehetősége szöveges<br>
  formátumú fájlok létrehozására azok tartalmának megírására és szerkesztésére<br>
  az igy készített fájlokat is ugyan úgy tároljuk mint a hagyományosan<br>
  feltöltött fájlokat.Továbbá lehetőség lesz a felhasználóknak a felhasználónév<br>
  és a jelszó módosítársára. A fájl kezelőt nem csak asztali számítógépről lehet<br>
  használni ezért a weboldalnak reszponzívnak kell lennie hogy azt pc-ről<br>
  táblagépről és telefonról egyaránt használható és át tekinthető  legyen.
## 4. Jelenlegi üzleti folyamatok

## 5. Igényelt üzleti feladatok

