**Napravite javne klase ParkngMestoException, ParkingMesto, Parking i TestParking sa sledećim uslovima:**

a)	Klasa ParkngMestoException predstavlja neproveravani izuzetak (nasleđuje klasu RuntimeException) i ima:
-	Javni konstruktor koji kao parametar prima poruku greške i poziva odgovarajući konstruktor nadklase prosleđujući mu parametar.

b)	Javna klasa ParkingMesto koja ima: 
-	Privatni atribut slobodno koji predstavlja indikator zauzetosti parking mesta. Ovaj indikator ima vrednost TRUE ako je mesto slobodno a FALSE ako nije. 
-	Privatni atribut registarskiBroj koji predstavlja registarski broj vozila koje se nalazi na tom parking mestu (String). 
-	Odgovarajuće javne get i set metode za ova dva atributa. 

c)	Javna klasa Parking koja ima: 
-	Privatni atribut mesta koji predstavlja niz objekata klase ParkingMesto. 
-	Javni konstruktor koji kao ulazni argument prima broj koji predstavlja kapacitet parkinga tj. ukupan broj parking mesta. Ako je uneti broj veći od nule, potrebno je inicijalizovati atribut mesta na taj kapacitet. Ako je uneti broj nula ili manji od nule, kapacitet parking mesta se postavlja na 40 i baca se izuzetak klase ParkingMestoException sa odgovarajućom porukom. U svakom slučaju je potrebno inicijalizovati svako parking mesto i postaviti ga da bude slobodno. 
-	Javnu metodu koja vraca registarski broj kola koja se nalaze na prvom parking mestu. Ako je parking mesto slobodno, vraca se poruka o tome. 
-	Javnu metodu koja vraca registarski broj kola koja se nalaze na poslednjem parking mestu. Ako je parking mesto slobodno, vraca se poruka o tome. 
-	Javnu metodu koja proverava da li na parkingu ima slobodnih mesta i vraća TRUE ako ima, a FALSE ako nema. 
-	Javnu metodu koja vraća broj slobodnih parking mesta. 
-	Javnu metodu koja kao ulazni argument prima registarski broj vozila i proverava da li se to vozilo nalazi na parkingu. Ako se nalazi, metoda vraća TRUE a suprotnom FALSE. 
-	Javnu metodu za “uvođenje” vozila na parking. Ova metoda kao ulazni argument dobija registarski broj vozila. Prvo je potrebno proveriti da li na parkingu ima slobodnih mesta. Ako ima, potrebno je uvesti vozilo na prvo slobodno mesto. Ako slobodnih mesta nema, vratiti poruku o tome. 
-	Javnu metodu za “izvođenje” vozila sa parkinga. Ova metoda kao ulazni argument dobija registarski broj vozila. Prvo je potrebno proveriti da li se vozilo sa tim registarskim brojem nalazi na parkingu. Ako se nalazi, potrebno ga je izvesti, tako da parking mesto ponovo postane slobodno. Izvodjenje vozila podrazumeva da se mesto na kome je bilo označi kao slobodno i da se podatak o njegovom registarskom broju ukloni. 
-	Javnu metodu koja na vraca registarske brojeve svih vozila koja se nalaze na parkingu i broj parking mesta na kome se nalaze. Naravno, vracaju se samo ona parking mesta koja su zauzeta. 
-	Javnu metodu koja vraca registarske brojeve svih vozila koja se nalaze na parkingu a imaju beogradske tablice. 

d)	Glavna klasa WriteParking koja kreira jedan objekat klase Parking kapaciteta 50 mesta i u njega unosi kola sa tablicama “BG 123-456” i “NS 234-56”. Koristeći klasu PrintWriter u tekstualni fajl “parking.txt” upisati reigstarske tablice svih vozila koja su na parkingu, a onda I registarske tablica vozila iz Beograda.
