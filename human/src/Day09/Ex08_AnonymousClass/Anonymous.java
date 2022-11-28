package Day09.Ex08_AnonymousClass;

public class Anonymous {

	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv를 끕니다");
		}
	}; 
	

void methodA {
	RemoteControl drone = new RemoteControl() {
		
		@Override
		public void turnOn() {

			System.out.println("드론 전원 킵니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("드론 전원 끕니다");
		}
	}; 
	
	drone.turnOn();
	
	
}

void methodB(RemoteControl rc) {
	rc.turnOn();
}
}