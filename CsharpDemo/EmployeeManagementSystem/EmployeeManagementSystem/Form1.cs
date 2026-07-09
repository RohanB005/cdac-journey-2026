using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EmployeeManagementSystem
{
    public partial class Form1 : Form
    {
        List<Employee> employees = new List<Employee>();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            comboBox1.Items.Add("Manager");
            comboBox1.Items.Add("Developer");
            comboBox1.Items.Add("Tester");
            comboBox1.Items.Add("HR");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Employee emp = new Employee();

            emp.Id = Convert.ToInt32(textBox1.Text);
            emp.Name = textBox2.Text;
            emp.Email = textBox3.Text;
            emp.Designation = comboBox1.Text;

            employees.Add(emp);

            MessageBox.Show("Employees Saved");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            dataGridView1.DataSource = null;
            dataGridView1.DataSource = employees;

        }

        private void button3_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(textBox1.Text);

            Employee emp = employees.Find(x => x.Id == id);

            if (emp != null)
            {
                employees.Remove(emp);

                MessageBox.Show("Employees Removed");
            }
            else
            {
                MessageBox.Show("Employees Not Found");
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();

            comboBox1.SelectedIndex = -1;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            int id = Convert.ToInt32(textBox1.Text);

            Employee emp = employees.Find(x => x.Id == id);

            if (emp != null)
            {
                emp.Name = textBox2.Text;
                emp.Email = textBox3.Text;
                emp.Designation = comboBox1.Text;

                MessageBox.Show("Update Successfully");
            }
            else
            {
                MessageBox.Show("Employee Not Found");
            }
        }

        private void RefreshGrid()
        {
            dataGridView1.DataSource = null;
            dataGridView1.DataSource = employees;
        }
    }
}
