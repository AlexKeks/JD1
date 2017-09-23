package by.htp.classWork;



public class TerminatorFactory {

	public static Terminator getTerminator(String value) {
		if("T800".equals(value)){
			return new T800(new SaveTarget("John Connor"));
		}
		else if ("T1000".equals(value)){
			return new T1000( new KillTarget("Sarah Connor"));
		}
		else if ("T2000".equals(value)){
			return new T2000(new SaveTarget("WORLD!"));
		}
		else{
			throw new IllegalArgumentException("Bad value: " + value);
			
		}
	}
}
