using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	string s,s2;
	int n;
	Encriptado encrip = new Encriptado ();
	int cont=0;

	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void Procesar (object sender, EventArgs e)
	{
		salidaTexto.DeleteText (0,salidaTexto.Text.Length);
		s = entradaTexto.Text;
		//n =Convert. clave.Text;
		//n=Convert.Int(entradaTexto.Text);
		n= Convert.ToInt32 (clave.Text);
		s2 = encrip.encriptado (s, n);
		salidaTexto.InsertText (s2);

	}
	/*
	protected void OnClaveChanged (object sender, EventArgs e)
	{
		throw new NotImplementedException ();
	}

	protected void OnEntradaTextoInsertAtCursor (object o, InsertAtCursorArgs args)
	{

	}*/
}
