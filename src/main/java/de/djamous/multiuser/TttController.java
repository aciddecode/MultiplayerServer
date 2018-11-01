package de.djamous.multiuser;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.djamous.ttt.Spielplan;

@RestController
@RequestMapping("/tictactoe-controller")
public class TttController {
	@Autowired
	Spielplan spielplan;

	@RequestMapping(method = RequestMethod.POST, value = "/feld")
	public Spielplan setFeld(@RequestParam(value = "sessionId") UUID uuid, @RequestParam(value = "name") char name,
			@RequestParam(value = "x") int x, @RequestParam(value = "y") int y) {
		spielplan.setFeld(x, y, name);
		return spielplan;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/spielplan")
	public Spielplan initSpielplan() {
		spielplan.initializeBrett();
		return spielplan;
	}

}
