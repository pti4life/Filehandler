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
lenne a dokumentumok áramlása ami további problémákhoz vezethet. Ezek könnyen <br> automatizálható folyamatok amelyek, további időt vesznek el a tényleges munkaidőből<br>
azaz csökken a gyár effektív munkavégzése. Ezek mellett az emberi hiba esélye is<br>
sokkal nagyobb hisz fenn áll a veszélye, hogy a dokumentációk nem jutnak el időben<br>
a cég többi részlegéhez, esetleges illetékes emberekhez. Biztonsági kockázatok is<br>
fennállnak mert fizikailag a dokumentumokat el kell helyezni valahol, és fenn áll<br>
a veszélye, hogy ezekhez illetéktelen személyek is hozzáférnek. Egy professzionális<br>
rendszer ezeket a folyamatokat gyökeresen megváltoztatná, a cég működése mérföldekkel<br> effektívebb, biztonságosabb lenne hisz bármilyen dokumentum másolata továbbítható<br>
a rendszerben szereplő felhasználóknak amiről automatikus értesítést kap a célszemély<br>
akinek a dokumentumok el lettek küldve.

## 3. Vágyálom rendszer

## 4. Jelenlegi üzleti folyamatok


## 5. Igényelt üzleti feladatok
Olyan fájlkezelő rendszerre van szükség amely webböngészőből elérhető a 
<br>felhasználóknak első bejelentkezéskor be kell regisztrálják magukat a 
<br>rendszerbe a már regisztrált felhasználóknak csak bejelentkezés szükséges
<br> a fájlkezelő rendszer eléréséhez.Fontos biztonsági szempont hogy
<br>valóban csak a bejelentkezett felhasználók érjék el  a fájlkezelőt azok
<br>akik csak a linket birtokolják ne érjék el a felületet.Bejelentkezés 
<br>után legyen látható egy lista amin szerepel a tárolt fájlok neve,mérete
<br>és létrehozási dátuma.A rendszer lehetőséget kell biztosítson fájlok 
<br>feltöltésére törlésére és letöltésére.Minden felhasználó csak a saját 
<br>maga által létrehozott vagy feltöltött fájlokhoz fér hozzá.továbbá fájlok
<br>továbbitására más felhasználóknak akár eggyesével akár több fájl 
<br>kijelölésével egyszerre,ehhez meg kell adniuk a címzett felhasználónevét.
<br>Ezekről a fájlokról a másik felhasználó másolatot kap. Az ilyen módon 
<br>kapott fájlokat is ugyanúgy lehet látni és kezelni, mint a saját maga
<br>által létrehozott fájlokat. A másolatokról láthatónak kell lennie, 
<br>hogy ki küldte át. A fogadó felhasználónak a saját email címére email
<br>értesítést kell kapnia az átküldött fájl(ok)ról, amiben szerepel a fájlok
<br>neve, és a küldő felhasználó neve.A listáról kiindulva lehessen új fájlokat
<br> feltölteni, szöveges fájlt létrehozni, meglévőket szerkeszteni, törölni. 
<br>Fájlok neve nem kell hogy egyedi legyen. Több fájlnak is lehet egyszerre 
<br>ugyanaz a neve. Amikor új szövegest fájlt akarok létrehozni, akkor vigyen
<br> el egy üres űrlapra, ahol megadhatom a nevét és a tartalmát. Sikeres
<br>mentéskor térjen vissza a listára. A listán a szöveges fájlok mellett
<br>legyen egy szerkeszt gomb vagy link, amire kattintva elvisz az űrlapra,
<br>ahol a tartalmát és a nevét szerkeszthetem. Mentéskor térjen vissza a
<br>listára.Bejelentkezés után a felhasználónak legyen lehetősége az felhasználónevének
<br>és jelszavának megváltoztatására. Legyen egy kilépés gomb ami mindig 
<br>látszik valahol az oldalon, függetlenül attól, hogy melyik felületen vagyok.
<br>Fontos hogy a felület könnyen át tekinthető legyen és egyben 
<br>biztonságos is.Mivel a szoftvert cégünk almazottai fogják használni 
<br>fontos hogy az adatok könnyen nyomon követhetőek legyenek  a bizalmas
<br>információk kiszivárgásának elkerülése végett. A felhasználók adatait
<br>adatbázisban tárolja a szoftver míg a fájlokat a szerveren felhasználók szerint
<br>külömböző mappákban. Regisztrációkor minden felhasználó User jogosultsággal rendelezzen.
<br>Felhasználók törlésére csak az adatbázis adminisztátornak lehessen lehetősége
<br>Webes védelemről gondoskodik az is hogy helyi lokális szerveren fog futni az alkalmazás
<br>így csak az itt dolgozók férhetnek hozzá. 

### 6. Fogalom szótár
* regisztrált felhasználó: Az a felhasználója a szolgáltatásnak, amely a regisztrációs folyamatot<br> sikeresen végrehajtotta ezáltal bekerült a rendszerbe és az adatait használva sikeres bejelentkezést tud végrehajtani.
* bejelentkezés: Az a folyamat amely után a regisztrált felhasználó elérheti a webszolgáltatás által nyújtott funkciók lényegi részét. 