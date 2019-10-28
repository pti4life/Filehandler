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

## 4. Jelenlegi üzleti folyamatok

## 5. Igényelt üzleti feladatok

* A szolgáltatásnak 3 fő része legyen, a bejelntkezés, regisztráció, és a nyitó oldal<br>
* A felhasználó először a nyitóoldallal találkozzon.

* A rendszer használata előzetes regisztrációhoz kötött amit helyen kitöltve <br>
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

* A validcáiós folyamatok megfelelő visszajelzést is adnak eredményükről.<br>
* Sikertelen bejelentkezés esetén egy hibaüzenetet olvashat a felhasználó.<br>
* Sikeres bejelentkezés esetén átirányít a fájl listára és több funkció is <br>
elérhetővé válik a sikeres bejelentkezést követően.<br>


* Fontos hogy a fájl lista akkor és csak akkor látható ha a felhasználó<br>
  sikeresen bejelentkezett!
* A fájl listán egy táblázatban látható a fájlok:
    * neve
    * mérete
    * módosítási dátuma
    * ki küldte a fájlt
* Egy oldalon 5 fájl jelenjen meg.
* Alapértelmezetten betűrendben.
* A fájl küldésének folyamatának tudnia kell egyszerre több fájlt küldeni illetve<br>
* A fájlok kijelölése checkbox-ok bepipálásával történik.
* A fájlok küldése egy küldés gomb lenyomásával történik.
* Küldésnél az alábbi validációs folyamatok történnek:
    * Van-e kijelölt fájl? Ha nincs hibaüzenettel tájékoztatjuk a felhasználót.
    * Létezik-e a felhasználó akinek szeretnénk küldeni? Ha nincs hibaüzenettel<br>
      tájékoztatjük a felhasználót
    * Sikeres küldés esetén is üzenetet kap a felhasználó. Ekkor az elküldött <br>
    fájl a LEMÁSOLÓDIK és a másolat átkerül az szerveren lévő mappájába. <br>
    és bekerül az adatbázisába is.

* Fájlaink között keresést tudunk végrehajtani. A fájl nevére lehet keresni<br>
  teljes egyezőség szerint.


* Fájlfeltöltést is támogatja a szolgáltatás. A felhasználó kitallózza<br>
a számítógépéről a megfelelő fájlt.<br>
A feltöltés gomb lenyomása után a fájlnév validálásra kerül, nem megfelelő <br>
fájlnév esetén üzenetet kap a felhasználó.<br>
Megfelelő név esetén a fájl eltárolásra kerül a szerveren és az adatbázisban.

* Fájl törlésére is van lehetőség. A felhasználó kiválaszthatja a törlést a <br>
műveleteknél.

* Fájl letöltés: A felhasználó kiválaszthatja a letöltést a fájlthoz tartozó <br> műveleteknél.

* Szöveges fájl létrehozása: A fájl lista oldalán található lesz egy gomb amire <br>
kattintva elérhetővé válik egy felület ahol a felhasználó szöveges fájlt hozhat létre. <br>
A fájl mentését követően a fájlnév validálásra kerül és ha megfelelő eltárolódik <br>
a szerveren és az adatbázisban is.

* Szöveges fájl szerkesztése: A fájl listában, a fájl műveleteknél elérhető lesz a<br>
"szerkesztés" művelet amire kattintva elnavigál a szöveges fájl lérehozásánál is <br>
használt felületre, csak a fájlt tartalmának helye nem üres lesz hanem a szerkesztett<br>
fájl tartalma.

* Felhasználónév módosítás: A felhasználónak lehetősége van a profilján felhasználó neve <br>
módosítására. Az alábbi validációs folyamatok futnak le ilyenkor:
    * Ha a felhasználónév már létezik akkor hibaüzenetet kap.
    * Ha a felhasználónév még nem létezik és valid a felhasználónév akkor megváltozik<br>
     amiről szintén értesítést kap.

* Jelszó módosítás: A felhasználó a profil menüpont alatt jelszavát módosíthatja <br>
Ha az új jelszó megfelel a hozzá tartozó validációs folyamatnak akkor a jelszó megváltozi, egyébként nem. Mindkettőről értesítést kap a felhasználó.