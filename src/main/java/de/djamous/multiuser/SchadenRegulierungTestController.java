package de.djamous.multiuser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.djamous.schaden.GeraeteArtenListe;
import de.djamous.schaden.Geraeteart;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class SchadenRegulierungTestController {
	@RequestMapping(method = RequestMethod.GET, value = "/geraeteart")
	public List<Geraeteart> getGeraeteart() {
		List<Geraeteart> liste = new ArrayList<Geraeteart>();
		Geraeteart geraeteart1 = new Geraeteart();
		geraeteart1.setText("Fernsher");
		geraeteart1.setValue("fernseher");
		liste.add(geraeteart1);
		Geraeteart geraeteart2 = new Geraeteart();
		geraeteart2.setText("Router");
		geraeteart2.setValue("router");
		liste.add(geraeteart2);
		Geraeteart geraeteart3 = new Geraeteart();
		geraeteart3.setText("Hifi Anlage");
		geraeteart3.setValue("hifi_anlage");
		liste.add(geraeteart3);
		Geraeteart geraeteart4 = new Geraeteart();
		geraeteart4.setText("AV-Receiver");
		geraeteart4.setValue("av_receiver");
		liste.add(geraeteart4);
		Geraeteart geraeteart5 = new Geraeteart();
		geraeteart5.setText("Telefon");
		geraeteart5.setValue("telefon");
		liste.add(geraeteart5);
		Geraeteart geraeteart6 = new Geraeteart();
		geraeteart6.setText("Videospiel Konsole");
		geraeteart6.setValue("konsole");
		liste.add(geraeteart6);
		return liste;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/geraetearten")
	public String getGeraeteartListe() {
//		GeraeteArtenListe liste = new GeraeteArtenListe();
		return "{\r\n" + "	\"result\": [{\r\n" + "			\"paramname\": \"Geraeteart\",\r\n"
				+ "			\"parambeschriftung\": \"Geräteart\",\r\n" + "			\"paramtype\": \"Kategorie\",\r\n"
				+ "			\"paramvalues\": [{\r\n" + "					\"name\": \"TV_Geraete\",\r\n"
				+ "					\"beschriftung\": \"TV-Geräte\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Router_DSL_Geraet\",\r\n"
				+ "					\"beschriftung\": \"Router/DSL-Gerät\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Telefon_und_Telefonanlage\",\r\n"
				+ "					\"beschriftung\": \"Telefon und Telefonanlage\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Notebook\",\r\n"
				+ "					\"beschriftung\": \"Notebook\"\r\n" + "				},\r\n" + "				{\r\n"
				+ "					\"name\": \"Desktop_PC\",\r\n"
				+ "					\"beschriftung\": \"Desktop-PC\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"PC_Monitor\",\r\n"
				+ "					\"beschriftung\": \"PC-Monitor\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Kochfelder\",\r\n"
				+ "					\"beschriftung\": \"Kochfelder\"\r\n" + "\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Hifi_Verstaerker_Receiver\",\r\n"
				+ "					\"beschriftung\": \"Hifi-Verstärker-Receiver\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Receiver\",\r\n"
				+ "					\"beschriftung\": \"Receiver\"\r\n" + "				}\r\n" + "\r\n"
				+ "			]\r\n" + "		},\r\n" + "		{\r\n" + "			\"paramname\": \"Hersteller\",\r\n"
				+ "			\"parambeschriftung\": \"Hersteller\",\r\n" + "			\"paramtype\": \"Kategorie\",\r\n"
				+ "			\"paramvalues\": [{\r\n" + "					\"name\": \"Blaupunkt\",\r\n"
				+ "					\"beschriftung\": \"Blaupunkt\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Samsung\",\r\n"
				+ "					\"beschriftung\": \"Samsung\"\r\n" + "				},\r\n" + "				{\r\n"
				+ "					\"name\": \"LG\",\r\n" + "					\"beschriftung\": \"LG\"\r\n"
				+ "				},\r\n" + "				{\r\n" + "					\"name\": \"Loewe\",\r\n"
				+ "					\"beschriftung\": \"Loewe\"\r\n" + "				},\r\n" + "				{\r\n"
				+ "					\"name\": \"Medion\",\r\n" + "					\"beschriftung\": \"Medion\"\r\n"
				+ "				},\r\n" + "				{\r\n" + "					\"name\": \"Thomson\",\r\n"
				+ "					\"beschriftung\": \"Thomson\"\r\n" + "				},\r\n" + "				{\r\n"
				+ "					\"name\": \"Grundig\",\r\n" + "					\"beschriftung\": \"Grundig\"\r\n"
				+ "				},\r\n" + "				{\r\n" + "					\"name\": \"Google_TV\",\r\n"
				+ "					\"beschriftung\": \"Google-TV\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Hisense\",\r\n"
				+ "					\"beschriftung\": \"Hisense\"\r\n" + "				},\r\n" + "				{\r\n"
				+ "					\"name\": \"Panasonic\",\r\n"
				+ "					\"beschriftung\": \"Panasonic\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Philips\",\r\n"
				+ "					\"beschriftung\": \"Philips\"\r\n" + "				},\r\n" + "				{\r\n"
				+ "					\"name\": \"Sony\",\r\n" + "					\"beschriftung\": \"Sony\"\r\n"
				+ "				},\r\n" + "				{\r\n" + "					\"name\": \"Technisat\",\r\n"
				+ "					\"beschriftung\": \"Technisat\"\r\n" + "				},\r\n"
				+ "				{\r\n" + "					\"name\": \"Toshiba\",\r\n"
				+ "					\"beschriftung\": \"Toshiba\"\r\n" + "				}\r\n" + "			]\r\n"
				+ "		}\r\n" + "	]\r\n" + "}";

	}

}
