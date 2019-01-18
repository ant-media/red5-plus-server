package io.antmedia.licence;

import io.antmedia.datastore.db.types.Licence;
import io.antmedia.rest.model.Result;
import io.antmedia.settings.ServerSettings;

public class CommunityLicenceService implements ILicenceService{

	private ServerSettings serverSettings = null;
	private boolean responseReceived = false;
	private Licence activeLicence = null;
	private String url;
	private String child;
	private String config;

	public void start() {
		//no need to implement for Community Edition
	}

	public Result saveLicence (Licence licence) {

		//no need to implement for Community Edition

		return new Result(false);
	}


	public Licence checkLicence (String key) {

		//no need to implement for Community Edition

		return null;
	}

	public ServerSettings getServerSettings() {
		return serverSettings;
	}

	public void setServerSettings(ServerSettings serverSettings) {
		this.serverSettings = serverSettings;
	}

	public boolean getResponseReceived() {
		return responseReceived;
	}

	public void setResponseReceived(boolean responseReceived) {
		this.responseReceived = responseReceived;
	}

	public Licence getActiveLicence() {
		return activeLicence;
	}

	public void setActiveLicence(Licence licence) {
		this.activeLicence = licence;
	}

	public ServerSettings fetchServerSettings() {
		return serverSettings;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}






}
