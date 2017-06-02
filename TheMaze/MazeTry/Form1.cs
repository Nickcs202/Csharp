using System;
using System.Collections.Generic;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace MazeTry
{
    public partial class Form1 : Form
    {
        private Maze Lab;
        private bool primeraVez;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            // padd == 20. LimiteV y LimiteH deben ser mùltiplos de padd

            int limiteV = 0, limiteH = 0;
            
            while (limiteV < this.Height-80)
                limiteV += 20;

            while (limiteH < this.Width-80)
                limiteH += 20;

            Lab.Generar(g, limiteH , limiteV, primeraVez);
            primeraVez = false;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            primeraVez = true;
            Lab = new Maze();
        }
    }
}
