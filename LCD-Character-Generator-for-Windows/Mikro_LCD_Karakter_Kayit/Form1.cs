using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Imaging;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Mikro_LCD_Karakter_Kayit
{
    public partial class Form1 : Form
    {

        int t1,t2,t3,t4,t5,t6,t7,t8,t9=0;

        public Form1()
        {
            InitializeComponent();
            DisplayBox.Visible = false;
        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            System.Diagnostics.Process.Start("https://github.com/ibrahimakin");
        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            if (DisplayBox.Visible)
            {
                switch (e.KeyCode)
                {
                    case (Keys.A):
                        buttonA_Click(sender, e);
                        break;
                    case (Keys.B):
                        buttonB_Click(sender, e);
                        break;
                    case (Keys.C):
                        buttonC_Click(sender, e);
                        break;
                    case (Keys.D):
                        buttonD_Click(sender, e);
                        break;
                    case (Keys.E):
                        buttonE_Click(sender, e);
                        break;
                    case (Keys.F):
                        buttonF_Click(sender, e);
                        break;
                    case (Keys.G):
                        buttonG_Click(sender, e);
                        break;
                    case (Keys.P):
                        buttonDP_Click(sender, e);
                        break;
                }
            }
            if (e.KeyCode == Keys.Delete)
                clear_Click(sender, e);
            if (e.Control && e.KeyCode == Keys.S)
            {
                save_Click(sender, e);
            }
        }

        private void clear_MouseHover(object sender, EventArgs e)
        {
            toolTipCLR.Show(" Del ", clear);
        }

        private void save_MouseHover(object sender, EventArgs e)
        {
            toolTipSAVE.Show(" CTRL + S ", save);
        }

        private void clear_Click(object sender, EventArgs e)
        {
            if (LCDBox.Visible)
            {
                button1.BackColor = Color.Gainsboro;
                button2.BackColor = Color.Gainsboro;
                button3.BackColor = Color.Gainsboro;
                button4.BackColor = Color.Gainsboro;
                button5.BackColor = Color.Gainsboro;
                button6.BackColor = Color.Gainsboro;
                button7.BackColor = Color.Gainsboro;
                button8.BackColor = Color.Gainsboro;
                button9.BackColor = Color.Gainsboro;
                button10.BackColor = Color.Gainsboro;
                button11.BackColor = Color.Gainsboro;
                button12.BackColor = Color.Gainsboro;
                button13.BackColor = Color.Gainsboro;
                button14.BackColor = Color.Gainsboro;
                button15.BackColor = Color.Gainsboro;
                button16.BackColor = Color.Gainsboro;
                button17.BackColor = Color.Gainsboro;
                button18.BackColor = Color.Gainsboro;
                button19.BackColor = Color.Gainsboro;
                button20.BackColor = Color.Gainsboro;
                button21.BackColor = Color.Gainsboro;
                button22.BackColor = Color.Gainsboro;
                button23.BackColor = Color.Gainsboro;
                button24.BackColor = Color.Gainsboro;
                button25.BackColor = Color.Gainsboro;
                button26.BackColor = Color.Gainsboro;
                button27.BackColor = Color.Gainsboro;
                button28.BackColor = Color.Gainsboro;
                button29.BackColor = Color.Gainsboro;
                button30.BackColor = Color.Gainsboro;
                button31.BackColor = Color.Gainsboro;
                button32.BackColor = Color.Gainsboro;
                button33.BackColor = Color.Gainsboro;
                button34.BackColor = Color.Gainsboro;
                button35.BackColor = Color.Gainsboro;
                button36.BackColor = Color.Gainsboro;
                button37.BackColor = Color.Gainsboro;
                button38.BackColor = Color.Gainsboro;
                button39.BackColor = Color.Gainsboro;
                button40.BackColor = Color.Gainsboro;

                t1 = t2 = t3 = t4 = t5 = t6 = t7 = t8 = 0;
                toplam1.Text = toplam2.Text = toplam3.Text = toplam4.Text = toplam5.Text = toplam6.Text = toplam7.Text = toplam8.Text = "0";
                label11.Text = label12.Text = label13.Text = label14.Text = label15.Text = label16.Text = label17.Text = label18.Text = ",0";
            }
            else
            {
                buttonA.BackColor = Color.Gainsboro;
                buttonB.BackColor = Color.Gainsboro;
                buttonC.BackColor = Color.Gainsboro;
                buttonD.BackColor = Color.Gainsboro;
                buttonE.BackColor = Color.Gainsboro;
                buttonF.BackColor = Color.Gainsboro;
                buttonG.BackColor = Color.Gainsboro;
                buttonDP.BackColor = Color.Gainsboro;

                t9 = 0;
                label01.Text = label02.Text = label03.Text = label04.Text = label05.Text = label06.Text = label07.Text = label08.Text = label30.Text = "0";
            }
        }

        private static int n = 1;

        private void save_Click(object sender, EventArgs e)
        {
            var frm = Form.ActiveForm;
            using (var bmp = new Bitmap(frm.Width, frm.Height))
            {
                frm.DrawToBitmap(bmp, new Rectangle(0, 0, bmp.Width, bmp.Height));
                Directory.CreateDirectory(@".\Kaydedilen");
                while (System.IO.File.Exists(@".\Kaydedilen\Karakter" + n.ToString() + ".png"))
                {
                    n++;
                }
                bmp.Save(@".\Kaydedilen\Karakter" + n.ToString() + ".png");
                n++;
                MessageBox.Show("Çıktının ekran görüntüsü \" Karakter" + (n-1) + ".png \"  olarak  \" Kaydedilen \" klasörüne kaydedildi.");
            }
        }

        private void button1_Click(object sender, EventArgs e)      //Matris 1,16
        {
            if (button1.BackColor == Color.Black)
            {
                t1 -= 16;
                toplam1.Text = t1.ToString();
                button1.BackColor = Color.Gainsboro;

                label11.Text =","+toplam1.Text;
                return;
            }
            button1.BackColor=Color.Black;
            t1 += 16;
            toplam1.Text=t1.ToString();

            label11.Text = "," + toplam1.Text;
        }

        private void button2_Click(object sender, EventArgs e)      //Matris 1, 8
        {
            if (button2.BackColor == Color.Black)
            {
                t1 -= 8;
                toplam1.Text = t1.ToString();
                button2.BackColor = Color.Gainsboro;

                label11.Text = "," + toplam1.Text;
                return;
            }
            button2.BackColor = Color.Black;
            t1 += 8;
            toplam1.Text = t1.ToString();

            label11.Text = "," + toplam1.Text;
        }

        private void button3_Click(object sender, EventArgs e)      //Matris 1, 4
        {
            if (button3.BackColor == Color.Black)
            {
                t1 -= 4;
                toplam1.Text = t1.ToString();
                button3.BackColor = Color.Gainsboro;

                label11.Text =","+toplam1.Text;
                return;
            }
            button3.BackColor = Color.Black;
            t1 += 4;
            toplam1.Text = t1.ToString();

            label11.Text = "," + toplam1.Text;
        }

        private void button4_Click(object sender, EventArgs e)      //Matris 1, 2
        {
            if (button4.BackColor == Color.Black)
            {
                t1 -= 2;
                toplam1.Text = t1.ToString();
                button4.BackColor = Color.Gainsboro;

                label11.Text = "," + toplam1.Text;
                return;
            }
            button4.BackColor = Color.Black;
            t1 += 2;
            toplam1.Text = t1.ToString();

            label11.Text = "," + toplam1.Text;
        }

        private void button5_Click(object sender, EventArgs e)      //Matris 1, 1
        {
            if (button5.BackColor == Color.Black)
            {
                t1 -= 1;
                toplam1.Text = t1.ToString();
                button5.BackColor = Color.Gainsboro;

                label11.Text = "," + toplam1.Text;
                return;
            }
            button5.BackColor = Color.Black;
            t1 += 1;
            toplam1.Text = t1.ToString();

            label11.Text = "," + toplam1.Text;
        }

        private void button6_Click(object sender, EventArgs e)      //Matris 2,16
        {
            if (button6.BackColor == Color.Black)
            {
                t2 -= 16;
                toplam2.Text = t2.ToString();
                button6.BackColor = Color.Gainsboro;

                label12.Text = "," + toplam2.Text;
                return;
            }
            button6.BackColor = Color.Black;
            t2 += 16;
            toplam2.Text = t2.ToString();

            label12.Text = "," + toplam2.Text;
        }

        private void button7_Click(object sender, EventArgs e)      //Matris 2, 8
        {
            if (button7.BackColor == Color.Black)
            {
                t2 -= 8;
                toplam2.Text = t2.ToString();
                button7.BackColor = Color.Gainsboro;

                label12.Text = "," + toplam2.Text;
                return;
            }
            button7.BackColor = Color.Black;
            t2 += 8;
            toplam2.Text = t2.ToString();

            label12.Text = "," + toplam2.Text;
        }

        private void button8_Click(object sender, EventArgs e)      //Matris 2, 4
        {
            if (button8.BackColor == Color.Black)
            {
                t2 -= 4;
                toplam2.Text = t2.ToString();
                button8.BackColor = Color.Gainsboro;

                label12.Text = "," + toplam2.Text;
                return;
            }
            button8.BackColor = Color.Black;
            t2 += 4;
            toplam2.Text = t2.ToString();

            label12.Text = "," + toplam2.Text;
        }

        private void button9_Click(object sender, EventArgs e)      //Matris 2, 2
        {
            if (button9.BackColor == Color.Black)
            {
                t2 -= 2;
                toplam2.Text = t2.ToString();
                button9.BackColor = Color.Gainsboro;

                label12.Text = "," + toplam2.Text;
                return;
            }
            button9.BackColor = Color.Black;
            t2 += 2;
            toplam2.Text = t2.ToString();

            label12.Text = "," + toplam2.Text;
        }

        private void button10_Click(object sender, EventArgs e)     //Matris 2, 1
        {
            if (button10.BackColor == Color.Black)
            {
                t2 -= 1;
                toplam2.Text = t2.ToString();
                button10.BackColor = Color.Gainsboro;

                label12.Text = "," + toplam2.Text;
                return;
            }
            button10.BackColor = Color.Black;
            t2 += 1;
            toplam2.Text = t2.ToString();

            label12.Text = "," + toplam2.Text;
        }

        private void button11_Click(object sender, EventArgs e)     //Matris 3,16
        {
            if (button11.BackColor == Color.Black)
            {
                t3 -= 16;
                toplam3.Text = t3.ToString();
                button11.BackColor = Color.Gainsboro;

                label13.Text = "," + toplam3.Text;
                return;
            }
            button11.BackColor = Color.Black;
            t3 += 16;
            toplam3.Text = t3.ToString();

            label13.Text = "," + toplam3.Text;
        }

        private void button12_Click(object sender, EventArgs e)     //Matris 3, 8
        {
            if (button12.BackColor == Color.Black)
            {
                t3 -= 8;
                toplam3.Text = t3.ToString();
                button12.BackColor = Color.Gainsboro;

                label13.Text = "," + toplam3.Text;
                return;
            }
            button12.BackColor = Color.Black;
            t3 += 8;
            toplam3.Text = t3.ToString();

            label13.Text = "," + toplam3.Text;
        }

        private void button13_Click(object sender, EventArgs e)     //Matris 3, 4
        {
            if (button13.BackColor == Color.Black)
            {
                t3 -= 4;
                toplam3.Text = t3.ToString();
                button13.BackColor = Color.Gainsboro;

                label13.Text = "," + toplam3.Text;
                return;
            }
            button13.BackColor = Color.Black;
            t3 += 4;
            toplam3.Text = t3.ToString();

            label13.Text = "," + toplam3.Text;
        }

        private void button14_Click(object sender, EventArgs e)     //Matris 3, 2
        {
            if (button14.BackColor == Color.Black)
            {
                t3 -= 2;
                toplam3.Text = t3.ToString();
                button14.BackColor = Color.Gainsboro;

                label13.Text = "," + toplam3.Text;
                return;
            }
            button14.BackColor = Color.Black;
            t3 += 2;
            toplam3.Text = t3.ToString();

            label13.Text = "," + toplam3.Text;
        }

        private void button15_Click(object sender, EventArgs e)     //Matris 3, 1
        {
            if (button15.BackColor == Color.Black)
            {
                t3 -= 1;
                toplam3.Text = t3.ToString();
                button15.BackColor = Color.Gainsboro;

                label13.Text = "," + toplam3.Text;
                return;
            }
            button15.BackColor = Color.Black;
            t3 += 1;
            toplam3.Text = t3.ToString();

            label13.Text = "," + toplam3.Text;
        }

        private void button16_Click(object sender, EventArgs e)     //Matris 4,16
        {
            if (button16.BackColor == Color.Black)
            {
                t4 -= 16;
                toplam4.Text = t4.ToString();
                button16.BackColor = Color.Gainsboro;

                label14.Text = "," + toplam4.Text;
                return;
            }
            button16.BackColor = Color.Black;
            t4 += 16;
            toplam4.Text = t4.ToString();

            label14.Text = "," + toplam4.Text;
        }

        private void button17_Click(object sender, EventArgs e)     //Matris 4, 8
        {
            if (button17.BackColor == Color.Black)
            {
                t4 -= 8;
                toplam4.Text = t4.ToString();
                button17.BackColor = Color.Gainsboro;

                label14.Text = "," + toplam4.Text;
                return;
            }
            button17.BackColor = Color.Black;
            t4 += 8;
            toplam4.Text = t4.ToString();

            label14.Text = "," + toplam4.Text;
        }

        private void button18_Click(object sender, EventArgs e)     //Matris 4, 4
        {
            if (button18.BackColor == Color.Black)
            {
                t4 -= 4;
                toplam4.Text = t4.ToString();
                button18.BackColor = Color.Gainsboro;

                label14.Text = "," + toplam4.Text;
                return;
            }
            button18.BackColor = Color.Black;
            t4 += 4;
            toplam4.Text = t4.ToString();

            label14.Text = "," + toplam4.Text;
        }

        private void button19_Click(object sender, EventArgs e)     //Matris 4, 2
        {
            if (button19.BackColor == Color.Black)
            {
                t4 -= 2;
                toplam4.Text = t4.ToString();
                button19.BackColor = Color.Gainsboro;

                label14.Text = "," + toplam4.Text;
                return;
            }
            button19.BackColor = Color.Black;
            t4 += 2;
            toplam4.Text = t4.ToString();

            label14.Text = "," + toplam4.Text;
        }

        private void button20_Click(object sender, EventArgs e)     //Matris 4, 1
        {
            if (button20.BackColor == Color.Black)
            {
                t4 -= 1;
                toplam4.Text = t4.ToString();
                button20.BackColor = Color.Gainsboro;

                label14.Text = "," + toplam4.Text;
                return;
            }
            button20.BackColor = Color.Black;
            t4 += 1;
            toplam4.Text = t4.ToString();

            label14.Text = "," + toplam4.Text;
        }

        private void button21_Click(object sender, EventArgs e)     //Matris 5,16
        {
            if (button21.BackColor == Color.Black)
            {
                t5 -= 16;
                toplam5.Text = t5.ToString();
                button21.BackColor = Color.Gainsboro;

                label15.Text = "," + toplam5.Text;
                return;
            }
            button21.BackColor = Color.Black;
            t5 += 16;
            toplam5.Text = t5.ToString();

            label15.Text = "," + toplam5.Text;
        }

        private void button23_Click(object sender, EventArgs e)     //Matris 5, 8
        {
            if (button23.BackColor == Color.Black)
            {
                t5 -= 8;
                toplam5.Text = t5.ToString();
                button23.BackColor = Color.Gainsboro;

                label15.Text = "," + toplam5.Text;
                return;
            }
            button23.BackColor = Color.Black;
            t5 += 8;
            toplam5.Text = t5.ToString();

            label15.Text = "," + toplam5.Text;
        }

        private void button25_Click(object sender, EventArgs e)     //Matris 5, 4
        {
            if (button25.BackColor == Color.Black)
            {
                t5 -= 4;
                toplam5.Text = t5.ToString();
                button25.BackColor = Color.Gainsboro;

                label15.Text = "," + toplam5.Text;
                return;
            }
            button25.BackColor = Color.Black;
            t5 += 4;
            toplam5.Text = t5.ToString();

            label15.Text = "," + toplam5.Text;
        }

        private void button27_Click(object sender, EventArgs e)     //Matris 5, 2
        {
            if (button27.BackColor == Color.Black)
            {
                t5 -= 2;
                toplam5.Text = t5.ToString();
                button27.BackColor = Color.Gainsboro;

                label15.Text = "," + toplam5.Text;
                return;
            }
            button27.BackColor = Color.Black;
            t5 += 2;
            toplam5.Text = t5.ToString();

            label15.Text = "," + toplam5.Text;
        }

        private void button29_Click(object sender, EventArgs e)     //Matris 5, 1
        {
            if (button29.BackColor == Color.Black)
            {
                t5 -= 1;
                toplam5.Text = t5.ToString();
                button29.BackColor = Color.Gainsboro;

                label15.Text = "," + toplam5.Text;
                return;
            }
            button29.BackColor = Color.Black;
            t5 += 1;
            toplam5.Text = t5.ToString();

            label15.Text = "," + toplam5.Text;
        }

        private void button31_Click(object sender, EventArgs e)     //Matris 6,16
        {
            if (button31.BackColor == Color.Black)
            {
                t6 -= 16;
                toplam6.Text = t6.ToString();
                button31.BackColor = Color.Gainsboro;

                label16.Text = "," + toplam6.Text;
                return;
            }
            button31.BackColor = Color.Black;
            t6 += 16;
            toplam6.Text = t6.ToString();

            label16.Text = "," + toplam6.Text;
        }

        private void button33_Click(object sender, EventArgs e)     //Matris 6, 8
        {
            if (button33.BackColor == Color.Black)
            {
                t6 -= 8;
                toplam6.Text = t6.ToString();
                button33.BackColor = Color.Gainsboro;

                label16.Text = "," + toplam6.Text;
                return;
            }
            button33.BackColor = Color.Black;
            t6 += 8;
            toplam6.Text = t6.ToString();

            label16.Text = "," + toplam6.Text;
        }

        private void button35_Click(object sender, EventArgs e)     //Matris 6, 4
        {
            if (button35.BackColor == Color.Black)
            {
                t6 -= 4;
                toplam6.Text = t6.ToString();
                button35.BackColor = Color.Gainsboro;

                label16.Text = "," + toplam6.Text;
                return;
            }
            button35.BackColor = Color.Black;
            t6 += 4;
            toplam6.Text = t6.ToString();

            label16.Text = "," + toplam6.Text;
        }

        private void button37_Click(object sender, EventArgs e)     //Matris 6, 2
        {
            if (button37.BackColor == Color.Black)
            {
                t6 -= 2;
                toplam6.Text = t6.ToString();
                button37.BackColor = Color.Gainsboro;

                label16.Text = "," + toplam6.Text;
                return;
            }
            button37.BackColor = Color.Black;
            t6 += 2;
            toplam6.Text = t6.ToString();

            label16.Text = "," + toplam6.Text;
        }

        private void button39_Click(object sender, EventArgs e)     //Matris 6, 1
        {
            if (button39.BackColor == Color.Black)
            {
                t6 -= 1;
                toplam6.Text = t6.ToString();
                button39.BackColor = Color.Gainsboro;

                label16.Text = "," + toplam6.Text;
                return;
            }
            button39.BackColor = Color.Black;
            t6 += 1;
            toplam6.Text = t6.ToString();

            label16.Text = "," + toplam6.Text;
        }

        private void button22_Click(object sender, EventArgs e)     //Matris 7,16
        {
            if (button22.BackColor == Color.Black)
            {
                t7 -= 16;
                toplam7.Text = t7.ToString();
                button22.BackColor = Color.Gainsboro;

                label17.Text = "," + toplam7.Text;
                return;
            }
            button22.BackColor = Color.Black;
            t7 += 16;
            toplam7.Text = t7.ToString();

            label17.Text = "," + toplam7.Text;
        }

        private void button24_Click(object sender, EventArgs e)     //Matris 7, 8
        {
            if (button24.BackColor == Color.Black)
            {
                t7 -= 8;
                toplam7.Text = t7.ToString();
                button24.BackColor = Color.Gainsboro;

                label17.Text = "," + toplam7.Text;
                return;
            }
            button24.BackColor = Color.Black;
            t7 += 8;
            toplam7.Text = t7.ToString();

            label17.Text = "," + toplam7.Text;
        }

        private void button26_Click(object sender, EventArgs e)     //Matris 7, 4
        {
            if (button26.BackColor == Color.Black)
            {
                t7 -= 4;
                toplam7.Text = t7.ToString();
                button26.BackColor = Color.Gainsboro;

                label17.Text = "," + toplam7.Text;
                return;
            }
            button26.BackColor = Color.Black;
            t7 += 4;
            toplam7.Text = t7.ToString();

            label17.Text = "," + toplam7.Text;
        }

        private void button28_Click(object sender, EventArgs e)     //Matris 7, 2
        {
            if (button28.BackColor == Color.Black)
            {
                t7 -= 2;
                toplam7.Text = t7.ToString();
                button28.BackColor = Color.Gainsboro;

                label17.Text = "," + toplam7.Text;
                return;
            }
            button28.BackColor = Color.Black;
            t7 += 2;
            toplam7.Text = t7.ToString();

            label17.Text = "," + toplam7.Text;
        }

        private void button30_Click(object sender, EventArgs e)     //Matris 7, 1
        {
            if (button30.BackColor == Color.Black)
            {
                t7 -= 1;
                toplam7.Text = t7.ToString();
                button30.BackColor = Color.Gainsboro;

                label17.Text = "," + toplam7.Text;
                return;
            }
            button30.BackColor = Color.Black;
            t7 += 1;
            toplam7.Text = t7.ToString();

            label17.Text = "," + toplam7.Text;
        }

        private void button32_Click(object sender, EventArgs e)     //Matris 8,16
        {
            if (button32.BackColor == Color.Black)
            {
                t8 -= 16;
                toplam8.Text = t8.ToString();
                button32.BackColor = Color.Gainsboro;

                label18.Text = "," + toplam8.Text;
                return;
            }
            button32.BackColor = Color.Black;
            t8 += 16;
            toplam8.Text = t8.ToString();

            label18.Text = "," + toplam8.Text;
        }

        private void button34_Click(object sender, EventArgs e)     //Matris 8, 8
        {
            if (button34.BackColor == Color.Black)
            {
                t8 -= 8;
                toplam8.Text = t8.ToString();
                button34.BackColor = Color.Gainsboro;

                label18.Text = "," + toplam8.Text;
                return;
            }
            button34.BackColor = Color.Black;
            t8 += 8;
            toplam8.Text = t8.ToString();

            label18.Text = "," + toplam8.Text;
        }

        private void button36_Click(object sender, EventArgs e)     //Matris 8, 4
        {
            if (button36.BackColor == Color.Black)
            {
                t8 -= 4;
                toplam8.Text = t8.ToString();
                button36.BackColor = Color.Gainsboro;

                label18.Text = "," + toplam8.Text;
                return;
            }
            button36.BackColor = Color.Black;
            t8 += 4;
            toplam8.Text = t8.ToString();

            label18.Text = "," + toplam8.Text;
        }

        private void button38_Click(object sender, EventArgs e)     //Matris 8, 2
        {
            if (button38.BackColor == Color.Black)
            {
                t8 -= 2;
                toplam8.Text = t8.ToString();
                button38.BackColor = Color.Gainsboro;

                label18.Text = "," + toplam8.Text;
                return;
            }
            button38.BackColor = Color.Black;
            t8 += 2;
            toplam8.Text = t8.ToString();

            label18.Text = "," + toplam8.Text;
        }

        private void button40_Click(object sender, EventArgs e)     //Matris 8, 1
        {
            if (button40.BackColor == Color.Black)
            {
                t8 -= 1;
                toplam8.Text = t8.ToString();
                button40.BackColor = Color.Gainsboro;

                label18.Text = "," + toplam8.Text;
                return;
            }
            button40.BackColor = Color.Black;
            t8 += 1;
            toplam8.Text = t8.ToString();

            label18.Text = "," + toplam8.Text;
        }

        private void buttonA_Click(object sender, EventArgs e)
        {
            if (buttonA.BackColor == Color.Black)
            {
                label01.Text = "0";
                buttonA.BackColor = Color.Gainsboro;
                t9 -= 1;
                label30.Text = t9.ToString();
                return;
            }
            buttonA.BackColor = Color.Black;
            label01.Text = "1";
            t9 += 1;
            label30.Text = t9.ToString();
        }

        private void buttonB_Click(object sender, EventArgs e)
        {
            if (buttonB.BackColor == Color.Black)
            {
                label02.Text = "0";
                buttonB.BackColor = Color.Gainsboro;
                t9 -= 2;
                label30.Text = t9.ToString();
                return;
            }
            buttonB.BackColor = Color.Black;
            label02.Text = "1";
            t9 += 2;
            label30.Text = t9.ToString();
        }

        private void buttonC_Click(object sender, EventArgs e)
        {
            if (buttonC.BackColor == Color.Black)
            {
                label03.Text = "0";
                buttonC.BackColor = Color.Gainsboro;
                t9 -= 4;
                label30.Text = t9.ToString();
                return;
            }
            buttonC.BackColor = Color.Black;
            label03.Text = "1";
            t9 += 4;
            label30.Text = t9.ToString();
        }

        private void buttonD_Click(object sender, EventArgs e)
        {
            if (buttonD.BackColor == Color.Black)
            {
                label04.Text = "0";
                buttonD.BackColor = Color.Gainsboro;
                t9 -= 8;
                label30.Text = t9.ToString();
                return;
            }
            buttonD.BackColor = Color.Black;
            label04.Text = "1";
            t9 += 8;
            label30.Text = t9.ToString();
        }

        private void buttonE_Click(object sender, EventArgs e)
        {
            if (buttonE.BackColor == Color.Black)
            {
                label05.Text = "0";
                buttonE.BackColor = Color.Gainsboro;
                t9 -= 16;
                label30.Text = t9.ToString();
                return;
            }
            buttonE.BackColor = Color.Black;
            label05.Text = "1";
            t9 += 16;
            label30.Text = t9.ToString();
        }

        private void buttonF_Click(object sender, EventArgs e)
        {
            if (buttonF.BackColor == Color.Black)
            {
                label06.Text = "0";
                buttonF.BackColor = Color.Gainsboro;
                t9 -= 32;
                label30.Text = t9.ToString();
                return;
            }
            buttonF.BackColor = Color.Black;
            label06.Text = "1";
            t9 += 32;
            label30.Text = t9.ToString();
        }

        private void buttonG_Click(object sender, EventArgs e)
        {
            if (buttonG.BackColor == Color.Black)
            {
                label07.Text = "0";
                buttonG.BackColor = Color.Gainsboro;
                t9 -= 64;
                label30.Text = t9.ToString();
                return;
            }
            buttonG.BackColor = Color.Black;
            label07.Text = "1";
            t9 += 64;
            label30.Text = t9.ToString();
        }

        private void buttonDP_Click(object sender, EventArgs e)
        {
            if (buttonDP.BackColor == Color.Black)
            {
                label08.Text = "0";
                buttonDP.BackColor = Color.Gainsboro;
                t9 -= 128;
                label30.Text = t9.ToString();
                return;
            }
            buttonDP.BackColor = Color.Black;
            label08.Text = "1";
            t9 += 128;
            label30.Text = t9.ToString();
        }

        private void btnLCD_Click(object sender, EventArgs e)
        {
            DisplayBox.Visible = false;
            LCDBox.Visible = true;
        }

        private void btnDISPLAY_Click(object sender, EventArgs e)
        {
            LCDBox.Visible = false;
            DisplayBox.Visible = true;
        }
    }
}
