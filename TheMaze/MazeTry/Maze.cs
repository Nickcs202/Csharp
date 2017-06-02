﻿using System;
using System.Drawing;
using System.Collections;


namespace MazeTry
{
    public class Maze
    {
        private int padd;
        private Random currentCelda;
        
        struct celda 
        {
            //0: no hay pared
            //1: hay pared
            //3: bordes
            public byte N, S, E, O;
        }

        private celda[,] celda0;

        public Maze()
        {
            padd= 55;
            currentCelda = new Random(DateTime.Now.Millisecond);
        }

        public void Generar(Graphics g, int LimiteH, int LimiteV, bool primereVez) 
        {
            Stack pila1 = new Stack(); 
            Stack pila2 = new Stack();            
            
            int totalCeldas, visitedCeldas, thisCelda1, thisCelda2;
            int masdeunaCelda, otraCelda;
            int m = 0, n = 0;
  
            for (int i = 0; i <= LimiteH; i += padd)
                n++; //Horizontal

            for (int i = 0; i <= LimiteV; i += padd)
                m++; //vertical

            totalCeldas = m * n;

            if (primereVez)
            {
                celda0 = new celda[m, n];

                for (int i = 0; i < m; i++)
                    for (int j = 0; j < n; j++)
                    {
                        celda0[i, j].O = 1;
                        celda0[i, j].N = 1;
                        celda0[i, j].E = 1;
                        celda0[i, j].S = 1;

                        if (i == 0)
                            celda0[i, j].N = 3;

                        if (j == 0)
                            celda0[i, j].O = 3;

                        if (i == m - 1)
                            celda0[i, j].S = 3;

                        if (j == n - 1)
                            celda0[i, j].E = 3;
                    }

                /*
                 * create a CellStack (LIFO) to hold a list of cell locations  
                set TotalCells = number of cells in grid  
                choose a cell at random and call it CurrentCell  
                set VisitedCells = 1  
   
                while VisitedCells < TotalCells  
                find all neighbors of CurrentCell with all walls intact   
                if one or more found  
                choose one at random  
                knock down the wall between it and CurrentCell  
                push CurrentCell location on the CellStack  
                make the new cell CurrentCell  
                add 1 to VisitedCells off the CellStack   
                else  
                pop the most recent cell entry
                make it CurrentCell 
                endIf 
                endWhile  
                 */

                visitedCeldas = 1;
                thisCelda1 = (int)currentCelda.Next(0, m); //Random no incluye el maximo valor
                thisCelda2 = (int)currentCelda.Next(0, n);

                while (visitedCeldas < totalCeldas)
                {
                    masdeunaCelda = 0;

                    if (celda0[thisCelda1, thisCelda2].N == 1)
                        if (celda0[thisCelda1 - 1, thisCelda2].N != 0 &&
                            celda0[thisCelda1 - 1, thisCelda2].E != 0 &&
                            celda0[thisCelda1 - 1, thisCelda2].O != 0 &&
                            celda0[thisCelda1 - 1, thisCelda2].S != 0)
                            masdeunaCelda++;


                    if (celda0[thisCelda1, thisCelda2].S == 1)
                        if (celda0[thisCelda1 + 1, thisCelda2].S != 0 &&
                            celda0[thisCelda1 + 1, thisCelda2].E != 0 &&
                            celda0[thisCelda1 + 1, thisCelda2].O != 0 &&
                            celda0[thisCelda1 + 1, thisCelda2].N != 0)
                            masdeunaCelda++;


                    if (celda0[thisCelda1, thisCelda2].E == 1)
                        if (celda0[thisCelda1, thisCelda2 + 1].N != 0 &&
                            celda0[thisCelda1, thisCelda2 + 1].S != 0 &&
                            celda0[thisCelda1, thisCelda2 + 1].E != 0 &&
                            celda0[thisCelda1, thisCelda2 + 1].O != 0)
                            masdeunaCelda++;


                    if (celda0[thisCelda1, thisCelda2].O == 1)
                        if (celda0[thisCelda1, thisCelda2 - 1].N != 0 &&
                            celda0[thisCelda1, thisCelda2 - 1].S != 0 &&
                            celda0[thisCelda1, thisCelda2 - 1].O != 0 &&
                            celda0[thisCelda1, thisCelda2 - 1].E != 0)
                            masdeunaCelda++;


                    if (masdeunaCelda > 0) // hay al menos una celda vecina con todas sus paredes
                    {
                        otraCelda = cogerCelda(ref celda0, thisCelda1, thisCelda2);
                        pila1.Push(thisCelda1);
                        pila2.Push(thisCelda2);

                        switch (otraCelda)
                        {
                            case 1:
                                thisCelda1--;
                                break;

                            case 2:
                                thisCelda1++;
                                break;

                            case 3:
                                thisCelda2++;
                                break;

                            case 4:
                                thisCelda2--;
                                break;
                        }

                        visitedCeldas++;
                    }

                    else
                    {

                        thisCelda1 = (int)pila1.Pop();
                        thisCelda2 = (int)pila2.Pop();
                    }

                } // se terminó el while
            }  // se terminò el if(primeraVez)

            DibujarLab(g, m, n, LimiteV, LimiteH);  
        }

        private int cogerCelda(ref celda[,] celda0, int thisCelda1, int thisCelda2) 
        {
            int escoger;
            bool valor = true;
            int c = 0;

            while (valor)
            {
                escoger = currentCelda.Next(1,5);

                switch (escoger)
                {
                    case 1:
                        if (celda0[thisCelda1, thisCelda2].N == 1)
                            if (celda0[thisCelda1 - 1, thisCelda2].N != 0 &&
                                celda0[thisCelda1 - 1, thisCelda2].E != 0 &&
                                celda0[thisCelda1 - 1, thisCelda2].O != 0 &&
                                celda0[thisCelda1 - 1, thisCelda2].S != 0)
                            {
                                celda0[thisCelda1, thisCelda2].N = 0;
                                celda0[thisCelda1 - 1, thisCelda2].S = 0;
                                valor = false;
                                c = 1;
                                //hará thisCelda1--;
                            }
                        break;

                    case 2:
                        if (celda0[thisCelda1, thisCelda2].S == 1)
                            if (celda0[thisCelda1 + 1, thisCelda2].S != 0 &&
                                celda0[thisCelda1 + 1, thisCelda2].E != 0 &&
                                celda0[thisCelda1 + 1, thisCelda2].O != 0 &&
                                celda0[thisCelda1 + 1, thisCelda2].N != 0)
                            {
                                celda0[thisCelda1, thisCelda2].S = 0;
                                celda0[thisCelda1 + 1, thisCelda2].N = 0;
                                valor = false;
                                c = 2;
                                //hará thisCelda1++;
                            }                        
                        break;

                    case 3:
                        if (celda0[thisCelda1, thisCelda2].E == 1)
                            if (celda0[thisCelda1, thisCelda2 + 1].N != 0 &&
                                celda0[thisCelda1, thisCelda2 + 1].S != 0 &&
                                celda0[thisCelda1, thisCelda2 + 1].E != 0 &&
                                celda0[thisCelda1, thisCelda2 + 1].O != 0)
                            {
                                celda0[thisCelda1, thisCelda2].E = 0;
                                celda0[thisCelda1, thisCelda2 + 1].O = 0;
                                valor = false;
                                c = 3;
                                //hará thisCelda2++;
                            }
                        break;

                    case 4:
                        if (celda0[thisCelda1, thisCelda2].O == 1)
                            if (celda0[thisCelda1, thisCelda2 - 1].N != 0 &&
                                celda0[thisCelda1, thisCelda2 - 1].S != 0 &&
                                celda0[thisCelda1, thisCelda2 - 1].O != 0 &&
                                celda0[thisCelda1, thisCelda2 - 1].E != 0)
                            {
                                celda0[thisCelda1, thisCelda2].O = 0;
                                celda0[thisCelda1, thisCelda2 - 1].E = 0;
                                valor = false;
                                c = 4;
                                // hará thisCelda2--;
                            }
                        break;
                }              
            }
           
            return c;
        }
        
        public void DibujarLab(Graphics g, int m, int n, int LimiteV, int LimiteH) 
        {
            /* for (int i = 0; i <= LimiteH; i += padd)
             n++; //Horizontal

         for (int i = 0; i <= LimiteV; i += padd)
             m++; //vertical
         */
       // for (int u = 0; u <=10; u ++){
        Pen pen=new Pen(Color.Red,5);
       
            int m2 = 0, n2 = 0;
            for (int i = 0; i <= LimiteV; i += padd)
            {
                n2 = 0;
                for (int j = 0; j <= LimiteH; j += padd)
                {
                    if (celda0[m2, n2].N == 1 || celda0[m2, n2].N == 3)
                    	g.DrawLine(pen, j, i, j + padd, i);

                    if (celda0[m2, n2].S == 1 || celda0[m2, n2].S == 3)
                        g.DrawLine(pen, j, i + padd, j + padd, i + padd);

                    if (celda0[m2, n2].O == 1 || celda0[m2, n2].O == 3)
                        g.DrawLine(pen, j, i, j, i + padd);

                    if (celda0[m2, n2].E == 1 || celda0[m2, n2].E == 3)
                        g.DrawLine(pen, j + padd, i, j + padd, i + padd);

                    n2++;
                    if (n2 == n) break;
                }
                m2++;
                if (m2 == m) break;
            }         
            
            
           // }

        }

    }
}
