using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Facade
{
    class Program
    {
        public abstract class Design
        {
            public abstract void setPosition(double x, double y);
            public abstract void setWidth(double x);
            public abstract void setHeight(double y);
            public abstract void setColor(int r, int g, int b);
        }

        public class TextBox : Design
        {
            public override void setPosition(double x, double y)
            {
                Console.WriteLine("TextBox has been set at " + x + " " + y);
            }

            public override void setWidth(double x)
            {
                Console.WriteLine("TextBox width is " + x + " now");
            }

            public override void setHeight(double y)
            {
                Console.WriteLine("TextBox Height is " + y + " now");
            }

            public override void setColor(int r, int g, int b)
            {

            }
        }

        public class Label : Design
        {
            public override void setPosition(double x, double y)
            {
                Console.WriteLine("Label has been set at " + x + " " + y);
            }

            public override void setWidth(double x)
            {
                Console.WriteLine("Label width is " + x + " now");
            }

            public override void setHeight(double y)
            {
                Console.WriteLine("Label Height is " + y + " now");
            }

            public override void setColor(int r, int g, int b)
            {
                Console.WriteLine("Label Color is set!");
            }
        }

        public class Button : Design
        {
            public override void setPosition(double x, double y)
            {
                Console.WriteLine("Button has been set at " + x + " " + y);
            }

            public override void setWidth(double x)
            {
                Console.WriteLine("Button width is " + x + " now");
            }

            public override void setHeight(double y)
            {
                Console.WriteLine("Button Height is " + y + " now");
            }

            public override void setColor(int r, int g, int b)
            {
                Console.WriteLine("Button Color is set!");
            }
        }

        public class GraphicalUserInterface
        {
            private Design textBox;
            private Design button;
            private Design label;

            public GraphicalUserInterface()
            {
                this.textBox = new TextBox();
                this.label = new Label();
                this.button = new Button();
            }

            public void createTextBox()
            {
                this.textBox.setPosition(1.0, 1.0);
                this.textBox.setWidth(1.0);
                this.textBox.setHeight(1.0);
            }

            public void createLabel()
            {
                this.label.setPosition(2.0, 2.0);
                this.label.setWidth(2.0);
                this.label.setHeight(2.0);
            }

            public void createButton()
            {
                this.button.setPosition(3.0, 3.0);
                this.button.setWidth(3.0);
                this.button.setHeight(3.0);
            }
        }

        static void Main(string[] args)
        {
            GraphicalUserInterface buildGUI = new GraphicalUserInterface();

            buildGUI.createButton();
            buildGUI.createLabel();
            buildGUI.createTextBox();
        }
    }
}
