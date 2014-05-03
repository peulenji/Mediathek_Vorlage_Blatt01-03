import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team
 * @version SoSe 2014
 */
class MedienDetailAnzeigerWerkzeug {
	private MedienDetailAnzeigerUI _ui;

	/**
	 * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
	 */
	public MedienDetailAnzeigerWerkzeug() {
		_ui = new MedienDetailAnzeigerUI();
	}

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien
	 *            Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
	public void setMedien(List<Medium> medien) {
		assert medien != null : "Vorbedingung verletzt: (medien != null)";
		JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
		// TODO Aufgabe 3.4.2 Die Mediendetails sollen angezeigt werden
		
		for (Object element : medien) {
			if (element instanceof DVD)

			{
				List<DVD> mylist = (List<DVD>)(List<?>) medien;
				for (DVD d : mylist)
				{
					String f = d.getTitel() + "\n" +
				               d.getRegisseur() + "\n" +
							   d.getLaufzeit() + "\n" +
				               d.getKommentar();
					selectedMedienTextArea.setText(f);
				}
				
				
				
			}
			if (element instanceof CD)
			{
				List<CD> mylist = (List<CD>)(List<?>) medien;
				for (CD d : mylist)
				{
					String f = d.getTitel() + "\n" +
				               d.getInterpret() +"\n" +
							   d.getSpiellaenge() +"\n"+
				               d.getKommentar();
					selectedMedienTextArea.setText(f);
				}
				
				
			}
			if (element instanceof Videospiel)
			{
				List<Videospiel> mylist = (List<Videospiel>)(List<?>) medien;
				for (Videospiel d : mylist)
				{
					String f = d.getTitel() +  "\n" + 
							 d.getSystem() + "\n" +
							d.getKommentar();
					selectedMedienTextArea.setText(f);
				}
				
			}
			
			
		}
		
		
		
	}

	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück.
	 * 
	 * @ensure result != null
	 */
	public JPanel getUIPanel() {
		return _ui.getUIPanel();
	}
}
