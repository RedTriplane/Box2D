package org.box2d.jfixby.api;

public interface ContactListener {

	void beginContact(Contact contact);

	void endContact(Contact contact);

	void preSolve(Contact contact, Manifold oldManifold);

	void postSolve(Contact contact, ContactImpulse impulse);

}
