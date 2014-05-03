class Videospiel implements Medium {

	private String _titel;
	private String _kommentar;
	private String _system;

	/**
	 * 
	 * @param titel
	 *            der Titel des Videospieles
	 * @param kommentar
	 *            ein Kommentar zu dem Videospiel
	 * @param system
	 *            von welchem Platform kann das Videospiel gelesen werden
	 * 
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * @require system != null
	 * 
	 * 
	 * @ensure getKommentar == kommentar
	 * @ensure getTitel == titel
	 * @ensure getMedienBezeichnung == "Videospiel"
	 * @ensure getSystem == system
	 * @ensure
	 */
	public Videospiel(String titel, String kommentar, String system) {

		assert titel != null : "Vorbedingung verletzt: titel != null";

		assert system != null : "Vorbedingung verletzt: system != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";

		_titel = titel;
		_kommentar = kommentar;
		_system = system;
	
	}

	@Override
	public String getKommentar() {
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung() {
		return "Videospiel";

	}

	@Override
	public String getTitel() {
		return _titel;
	}

	public String getSystem() {
		return _system;
	}

}