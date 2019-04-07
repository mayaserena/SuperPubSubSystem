package states.subscriber;

import events.AbstractEvent;

public class Stealth implements IState {

	@Override
	public void handleEvent(AbstractEvent event, String channelName) {
		System.out.println(" at a stealth state by ignoring the event.");
	}

}
