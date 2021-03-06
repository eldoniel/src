package projet.tiers3;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface Modele extends Remote {
	
	public ArrayList<Utilisateur> getListeInscrits() throws RemoteException;
	
	public void AjouterUtilisateur(Utilisateur UtilAjout) throws RemoteException, Exception;
	
	public Utilisateur ModifierUtilisateur(Utilisateur UtilAjout, String nom, String mdp) throws RemoteException, Exception;
	
	public void SupprimerUtilisateur(Utilisateur UtilSupp) throws RemoteException, Exception;
	
	public void SaveToXml() throws Exception;
	
	public void LoadFromXml() throws Exception;

}
