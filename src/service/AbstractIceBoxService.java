package service;

import org.slf4j.LoggerFactory;

import Ice.Communicator;
import Ice.Identity;
import IceBox.Service;

public abstract class AbstractIceBoxService implements Service {

	protected Ice.ObjectAdapter _adapter;
	protected Identity id;
	protected static org.slf4j.Logger logger = LoggerFactory.getLogger(AbstractIceBoxService.class);
//	protected static Sl4jLogerI iceLogger = new Sl4jLogerI("communicator");
	@Override
	public void start(String name, Communicator communicator, String[] args) {
//		Ice.Util.setProcessLogger(iceLogger);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
