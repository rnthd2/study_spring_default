package le06;

//배터리 분리형 - 배터리가 있는 상태에서 set으로 변경가능하다.
public class ElectronicRadioToy
{
	private Battery battery;

	public ElectronicRadioToy(Battery battery){
		this.battery = battery;
	}

	public void setBattery(Battery battery){
		this.battery = battery;
	}
}
