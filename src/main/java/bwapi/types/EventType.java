package bwapi.types;


/**
 * //TODO
 * NOT SURE YET HOW TO THIS WITH JavaBWAPIBackend
 */
public enum EventType {
	MatchStart(0),
	MatchEnd(1),
	MatchFrame(2),
	MenuFrame(3),
	SendText(4),
	ReceiveText(5),
	PlayerLeft(6),
	NukeDetect(7),
	UnitDiscover(8),
	UnitEvade(9),
	UnitShow(10),
	UnitHide(11),
	UnitCreate(12),
	UnitDestroy(13),
	UnitMorph(14),
	UnitRenegade(15),
	SaveGame(16),
	UnitComplete(17);

	private int value;

	public int getValue(){
		return value;
	}

	EventType(int value){
		this.value = value;
	}
}
