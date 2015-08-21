package patterns.design.chapter7.facadepattern;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	
	/**
	 * The facade is passed a reference to each component of the subsystem in its constructor
	 * The facade then assigns each component to the corresponding instance variable
	 * @param amp
	 * @param tuner
	 * @param dvd
	 * @param cd
	 * @param projector
	 * @param lights
	 * @param screen
	 * @param popper
	 */
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd,
			CdPlayer cd, Projector projector, TheaterLights lights,
			Screen screen, PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch " + movie +"!!!");
		popper.on();
		popper.pop();
		lights.on();
		screen.down();
		projector.on();
		lights.dim(2);
		amp.on();
		amp.setDvd(dvd);
		amp.setVolumne(11);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		System.out.println("Shutting down the theater...");
		popper.off();
		amp.off();
		projector.off();
		dvd.off();
		screen.up();
		lights.dim(10);
	}
	
	
		
}
