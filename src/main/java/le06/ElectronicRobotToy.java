package le06;

//배터리 분리형 - 배터리가 없는 상태에서 set을 해야만한다
public class ElectronicRobotToy
{
	private Battery battery;

	public ElectronicRobotToy(){
	}

	public void setBattery(Battery battery){
		this.battery = battery;
	}
}
