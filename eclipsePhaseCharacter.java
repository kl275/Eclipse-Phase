public class character
{
	// base attributes
	int cog			= 0;
	int coo			= 0;
	int int			= 0;
	int ref			= 0;
	int sav			= 0;
	int som			= 0;
	int wil			= 0;
	
	// derived attributes
	int		mox				= 1;
	int		luc				= 0;
	int		tt				= 0;
	int		ir				= 0;	
	float	dur				= 0;
	int		wt				= 0;	
	int		dr				= 0;
	int		init			= 0;
	int		spd				= 0;
	int		db				= 0;	
	
	// active skills
	int Animal Handling		= 0;
	int Beam Weapons		= 0;
	int Blades				= 0;
	int Climbing			= 0;
	int Clubs				= 0;
	int Control				= 0;
	int Deception			= 0;
	int Demolitions			= 0;
	int Disguise			= 0;
	int Exotic Melee		= 0;
	int Exotic Melee		= 0;
	int Exotic Ranged		= 0;
	int Exotic Ranged		= 0;
	int Flight				= 0;
	int Fray				= 0;
	int Free Fall			= 0;
	int Freerunning			= 0;
	int Gunnery				= 0;
	int Hardware			= 0;
	int Hardware			= 0;
	int Impersonation		= 0;
	int Infiltration		= 0;
	int Infosec				= 0;
	int Interfacing			= 0;
	int Intimidation		= 0;
	int Investigation		= 0;
	int Kinesics			= 0;
	int Kinetic Weapons		= 0;
	
	int medicineBiosculpting			= 0;
	int medicineExoticBiomorphs			= 0;
	int medicineGeneTherapy				= 0;
	int medicineGeneralPractice			= 0;
	int medicineImplantSurgery			= 0;
	int medicineNanomedicine			= 0;
	int medicineParamedic				= 0;
	int medicinePods					= 0;
	int medicinePsychiatry				= 0;
	int medicineRemoteSurgery			= 0;
	int medicineTraumaSurgery			= 0;
	int medicineUplifts(by type)		= 0;
	int medicineVeterinary				= 0;
	
	int NavigationAutonomists			= 0;
	int NetworkingCriminals				= 0;
	int NetworkingEcologists			= 0;
	int NetworkingFirewall				= 0;
	int NetworkingHypercorps			= 0;
	int NetworkingMedia					= 0;
	int NetworkingScientist				= 0;

	int Palming							= 0;
	int Perception						= 0;
	
	int PilotAircraft,					= 0;
	int pilot Anthroform				= 0;
	int pilotExoticVehicle				= 0;
	int pilotGroundcraftWheeled			= 0;
	int pilotGroundcraftTracked			= 0;
	int pilotSpacecraft					= 0;
	int pilotWatercraft					= 0;
	
	int Programming						= 0;
	int Protocol						= 0;
	int Psi Assault						= 0;
	int Psychosurgery					= 0;
	int Research						= 0;
	int Scrounging						= 0;
	int Seeker Weapons					= 0;
	int Sense							= 0;
	int Spray Weapons					= 0;
	int Swimming						= 0;
	int Throwing Weapons				= 0;
	int Unarmed Combat					= 0;


	// knowledge skills

	// getters & setters
	public int getCog()
	{
		return this.cog;
	}
	
	public void setCog(int attribute)
	{
		this.cog = attribute;
	}
	
	public int getCoo()
	{
		return this.coo;
	}
	
	public void setCoo(int attribute)
	{
		this.coo= attribute;
	}
	
	public int getInt()
	{
		return this.int;
	}
	
	public void setInt(int attribute)
	{
		this.int = attribute;
	}
	
	public int getRef()
	{
		return this.ref;
	}
	
	public void setRef(int attribute)
	{
		this.ref = attribute;
	}
	
	public int getSav()
	{
		return this.sav;
	}
	
	public void setSav (int attribute)
	{
		this.sav = attribute;
	}
	
	public int getSom()
	{
		return this.som;
	}
	
	public void setSom(int attribute)
	{
		this.som = attribute;
	}
	
	public int getWil()
	{
		return this.wil;
	}
	
	public void setWil(int attribute)
	{
		this.wil = attribute;
	}

// derived stats, moxie starts at 1 //

	public int getMox ()
	{
		return this.mox;
	}
	
	public void setMox (int attribute)
	{
		this.mox = attribute;
	}

	public int getLuc ()
	{
		return this.luc;
	}
	
	public void set (int attribute)
	{
		this.luc = ( (2) * getWil() );
	}

	public int getTT()
	{
		return this.TT;
	}
	
	public void set (int attribute)
	{
		this.tt = ( (getLuc()) / 5 );
	}

	public int get ()
	{
		return this.ir;
	}
	
	public void set (int attribute)
	{
		this.ir = (getLuc() * 2);
	}

	public float getDur ()
	{
		return this.dur;
	}
	
	public void setDur (int attribute)
	{
		this.dur = attribute;
	}

	public int getWT()
	{
		return this.wt;
	}
	
	public void set (int attribute)
	{
		this.wt = (this.getDur() / 5);
	}

dr = // if biomorph, = (dur * 1.5) if synth = (dur * 2);
	public int get ()
	{
		return this.dr;
	}
	
	public void set (string morphType)
	{	if this.morphType = "biomorph"
		{
			this.dr = 1.5;
		}
		if this.morphType = "synth"
		{
			this.dr = 2;
		}
	}

init = ( (int + ref) / 5 );
	public int get ()
	{
		return ;
	}
	
	public void set (int attribute)
	{
		this. = attribute;
	}

spd = ;
	public int get ()
	{
		return ;
	}
	
	public void set (int attribute)
	{
		this. = attribute;
	}

db = (som / 10);
	public int get ()
	{
		return ;
	}
	
	public void set (int attribute)
	{
		this. = attribute;
	}
	
	public string getBackground()
	{
		return this.background;
	}
	
	public void setBackground (string background)
	{
		this.background = attribute;
	}

	public string getFaction()
	{
		return this.faction;
	}
	
	public void setFaction (string faction)
	{
		this.Faction = attribute;
	}

// active skills -- 400 cp minimum //

Animal Handling		SAV
Beam Weapons		COO
Blades				SOM
Climbing			SOM
Clubs				SOM
Control				WIL*
Deception			SAV
Demolitions			COG*
Disguise			INT
Exotic Melee		SOM
Exotic Melee		SOM
Exotic Ranged		COO
Exotic Ranged		COO
Flight				SOM
Fray				REF
Free Fall			REF
Freerunning			SOM
Gunnery				INT
Hardware			COG
Hardware			COG
Impersonation		SAV
Infiltration		COO
Infosec				COG*
Interfacing			COG
Intimidation		SAV
Investigation		INT
Kinesics			SAV
Kinetic Weapons		COO
Medicine			COG
// Biosculpting, Exotic Biomorphs, Gene Therapy, General Practice, Implant Surgery, Nanomedicine, Paramedic, Pods,
// Psychiatry, Remote Surgery, Trauma Surgery, Uplifts (by type), Veterinary

Navigation			INT
Networking			SAV
// Autonomists (@-rep), Criminals (g-rep), Ecologists (e-rep), Firewall (i-rep), Hypercorps (c-rep), Media (f-rep),
// Scientists (r-rep). At the gamemaster’s discretion, this list can be expanded to other (sub)cultural groupings.

Networking			SAV
Palming				COO
Perception			INT
Pilot				REF
// Aircraft, Anthroform (walkers), Exotic Vehicle, Groundcraft (wheeled or tracked), Spacecraft, Watercraft

Programming			COG*
Protocol			SAV
Psi Assault			WIL*
Psychosurgery		INT
Research			COG
Scrounging			INT
Seeker Weapons		COO
Sense				INT*
Spray Weapons		COO
Swimming			SOM
Throwing Weapons	COO
Unarmed Combat		SOM

// knowledge skills 300 cp minimum //

Academics			COG
// Archeology, Astrobiology, Astronomy, Astrophysics, Astrosociology, Biochemistry, Biology, Botany, Computer Science, 
// Cryptography, Economics, Engineering, Genetics, Geology, Linguistics, Mathematics, Memetics, Nanotechnology, 
// Old Earth History, Physics, Political Science, Psychology, Sociology, Xeno-archeology, Xenolinguistics, Zoology

Art					INT
// Architecture, Criticism, Dance, Drama, Drawing, Painting, Performance, Sculpture, Simulspace Design, Singing, Speech, Writing

Interest			COG
// Ancient Sports, Celebrity Gossip, Conspiracies, Factor Trivia, Gambling, Hypercorp, Politics, Lunar Habitats, Martian Beers, 
// Old Earth Nation-States, Reclaimer Blogs, Science Fiction, Scum Drug Dealers, Spaceship Models, Triad Economics,
// Underground XP

Language			INT

Profession			COG
// Accounting, Appraisal, Asteroid Prospecting, Banking, Cool Hunting, Con Schemes, Distribution, Forensics, 
// Lab Technician, Mining, Police Procedures, Psychotherapy, Security Ops, Smuggling Tricks, Social Engineering,
// Squad Tactics, Viral Marketing, XP Production

// Rep -- start with 50 in one rep group //
anarchRep
civicRep
ecoRep
fameRep
guanxiRep
iRep
rnaRep/
}