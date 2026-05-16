package interfaces;

public class Audio implements RemoteControl {
	private int vol;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

	}

	@Override
	public void setVolume(int vol) {
		if (vol > RemoteControl.MAX_VOLUME) {
			this.vol = RemoteControl.MAX_VOLUME;
		} else if (vol < RemoteControl.MIN_VOLUME) {
			this.vol = RemoteControl.MIN_VOLUME;
		} else {
			this.vol = vol;
		}
		System.out.println("현재 Audio 볼륨 : " + this.vol);
	}

}
