using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ConnectedArchitecture.Models;
using Microsoft.Data.SqlClient;

namespace ConnectedArchitecture.DataAccessLayer
{
    public class TestDatabaseContext
    {
        string _connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=TestDatabase;Integrated Security=True";
            public List<Emp> SelectRecords() 

        {
            SqlConnection con = new SqlConnection(_connectionString);
            SqlCommand cmd = new SqlCommand("Select * from Emp", con);
            con.Open();

            SqlDataReader reader = cmd.ExecuteReader();
            List<Emp> records = new List<Emp>();
            while (reader.Read())
            {
                int id = Convert.ToInt32(reader[0]);
                string? nm = Convert.ToString(reader["Name"]);
                string? add = Convert.ToString(reader["Address"]);
                records.Add(
                    new Emp()
                    {
                        Id = id,
                        Name = nm,
                        Address = add
                    });
            }
            reader.Close();
            con.Close();    
            return records;
        }
        //Select Record by Id
        public Emp? SelectEmpById(int id)
        {
            SqlConnection con = new SqlConnection(_connectionString);
            SqlCommand cmd = new SqlCommand(
                "SELECT * FROM Emp WHERE Id=@Id",
                con);

            cmd.Parameters.AddWithValue("@Id", id);
            con.Open();
            SqlDataReader reader = cmd.ExecuteReader();
            Emp? emp = null;

            if(reader.Read())
            {
                emp = new Emp()
                {
                    Id = Convert.ToInt32(reader["Id"]),
                    Name = Convert.ToString(reader["Name"]),
                    Address = Convert.ToString(reader["Address"])
                };
            }
            reader.Close();
            con.Close();
            return emp;
        }
        //Insert Record
        public int InsertRecord(Emp obj)
        {
            SqlConnection con = new SqlConnection(_connectionString);
            SqlCommand cmd = new SqlCommand(
                "INSERT INTO Emp(Name, Address) VALUES(@Name, @Address)", con);

            cmd.Parameters.AddWithValue("@Name", obj.Name);
            cmd.Parameters.AddWithValue("@Address", obj.Address);

            con.Open();

            int result = cmd.ExecuteNonQuery();

            con.Close();
            return result;
        }

        //Update Record
        public int UpdateRecord(int id, Emp obj)
        {
            SqlConnection con = new SqlConnection( _connectionString);
            SqlCommand cmd = new SqlCommand("Update Emp SET Name=@Name, Address=@Address WHERE Id=@Id", con);
            cmd.Parameters.AddWithValue("@Id", id);
            cmd.Parameters.AddWithValue("@Name", obj.Name);
            cmd.Parameters.AddWithValue("@Address", obj.Address);

            con.Open();
            int result = cmd.ExecuteNonQuery();
            con.Close();

            return result;

        }

        //Delete Record

        public int DeleteRecord(int id)
        {
            SqlConnection con = new SqlConnection(_connectionString);
            SqlCommand cmd = new SqlCommand("DELETE from Emp WHERE Id=@Id", con);
            cmd.Parameters.AddWithValue("@Id", id);
            con.Open();
            int result = cmd.ExecuteNonQuery();
            con.Close();
            return result;  
        }
       
    }
}
