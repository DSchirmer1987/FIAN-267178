package musterloesungen.ausflugGK;

public enum TripIdeas {
	
	// version 1: enum contains:
	// 1. conditions in pseudo-boolean (as help for switch case in IO.java) <- from matrix of memo (not in documentation because it explains itself here)
	// 2. full text description of event -> idea of output for better information of user planner -> could be used in version 2, too 
	// pseudo-boolean uses AND/OR instead of &&/|| for better differentiation to real code
	/*
	 * Kegeln("evening OR weekend",
	 * "Kegeln: Normalerweise abends, am Wochenende auch tags�ber, sch�nes oder schlechtes Wetter. Auch mit Kindern m�glich."
	 * ), Freibad("!rainy AND evening",
	 * "Freibad: nur sch�nes Wetter. Nur tags�ber (nach 17:00 geschlossen)"),
	 * Hallenbad("!(holidays AND weekend)",
	 * "Hallenbad: Sch�nes oder schlechtes Wetter. Offen t�glich. An Wochenenden in den Schulferien wird das Bad gewartet und ist geschlossen."
	 * ), Wandern_im_Dunkelwald("!rainy AND !evening",
	 * "Wandern im Dunkelwald: Nur bei sch�nem Wetter. Tags�ber immer m�glich. Abends nicht m�glich."
	 * ), Freikurs_Musik("!holidays AND !weekend AND evening",
	 * "Freikurs Musik: Im Schulhaus, daher nur abends w�hrend der Schulzeit (nicht am Wochenende). Wetter egal."
	 * ), Brotbackkurs("weekend AND rainy",
	 * "Brotbackkurs: Wird nur am Wochenende bei schlechtwetter durchgef�hrt. Es gibt einen Tages- und einen Abendkurs."
	 * ), Schieferbergwerk("!evening OR (holidays AND weekend)",
	 * "Schieferbergwerk: T�glich tags�ber (keine Abendf�hrungen au�er an Wochenenden in den Schulferien)."
	 * ), Go_Kurse("(weekend AND rainy) OR (!weekend AND !rainy AND evening)",
	 * "Go-Kurse: Am Wochenende bei schlechtem Wetter (im Gemeindelokal Raum B4) oder aber unter der Woche, dann aber nur abends bei sch�nem Wetter (im Lokal Widder in der Gartenwirtschaft)."
	 * ), Billard("(evening OR weekend) AND !children",
	 * "Billard: Abends, am Wochenende auch tags�ber. F�r Kinder wegen der hohen Tische ungeeignet."
	 * ), Rennautofahren("!children AND !evening AND weekend AND holidays",
	 * "Rennautofahren: Nur Erwachsene: Nur tags�ber an Wochenenden der Schulferien."
	 * ), Open_Air_Kino("!rainy AND (evening OR weekend)",
	 * "Open-Air Kino: Nur abends. Am Wochenende auch tags�ber (dann aber mit Lichtschutz). Nur bei sch�nem Wetter."
	 * ), Korbflechten("!weekend AND holidays AND rainy",
	 * "Korbflechten: Nur in den Schulferien bei Schlechtwetter. Keine Kurse am Wochenende."
	 * ), Besuch_des_Wasserfalls("!evening",
	 * "Besuch des Wasserfalls: T�glich tags�ber. Keine Abendf�hrungen weil der Fu�weg zu dunkel ist."
	 * ), Zoobesuch("always", "Zoobesuch: T�glich offen, auch abends.");
	 * 
	 * private final String rule; private final String hint;
	 * 
	 * TripIdeas(String rule, String hint) { this.rule = rule; this.hint = hint; }
	 * 
	 * public String getRule() { return rule; }
	 * 
	 * public String getHint() { return hint; }
	 */

	// version 2: enum contains:
	// 1. method boolean output for control of output the respective event if conditions are fulfilled
	//		with arguments boolean weekend, rainy, holidays, evening, children
	// 2. return by logical operation from matrix of memo (not in documentation because it explains itself here)
	//		similar to switch case of version 1 in IO.java but way far easier to read and execute
	Kegeln {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (evening || weekend);
		}
	},
	Freibad {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!rainy && evening);
		}
	},
	Hallenbad {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!(holidays && weekend));
		}
	},
	Wandern_im_Dunkelwald {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!rainy && !evening);
		}
	},
	Freikurs_Musik {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!holidays && !weekend && evening);
		}
	},
	Brotbackkurs {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (weekend && rainy);
		}
	},
	Schieferbergwerk {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!evening || (holidays && weekend));
		}
	},
	Go_Kurse {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return ((weekend && rainy) || (!weekend && !rainy && evening));
		}
	},
	Billard {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return ((evening || weekend) && !children);
		}
	},
	Rennautofahren {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!children && !evening && weekend && holidays);
		}
	},
	Open_Air_Kino {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!rainy && (evening || weekend));
		}
	},
	Korbflechten {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!weekend && holidays && rainy);
		}
	},
	Besuch_des_Wasserfalls {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (!evening);
		}
	},
	Zoobesuch {
		public boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children) {
			return (true);
		}
	};

	// by abstract method can be found -> teacher, correct explanation?
	abstract boolean output(boolean weekend, boolean rainy, boolean holidays, boolean evening, boolean children);
}
