package rotmg.messaging.impl;

import alde.flash.utils.consumer.MessageConsumer;
import rotmg.messaging.incoming.IncomingMessage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ActivePet extends IncomingMessage {

	public int instanceID;

	public ActivePet(int param1, MessageConsumer param2) {
		super(param1, param2);
	}

	@Override
	public void parseFromInput(DataInput in) throws IOException {
		this.instanceID = in.readInt();
	}

	@Override
	public void writeToOutput(DataOutput out) throws IOException {
		out.writeInt(instanceID);
	}
}
