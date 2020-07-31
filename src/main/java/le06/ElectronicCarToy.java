package le06;

//배터리 일체형 - 배터리가 있으나 변경할 수 있는 여지가 없다
public class ElectronicCarToy
{
	private Battery battery;

	public ElectronicCarToy(){
		battery = new NormalBattery();
	}
}
