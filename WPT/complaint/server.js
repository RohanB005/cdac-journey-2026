const express = require("express");
const app = express();
const fs = require("fs");
const cors = require("cors");

app.use(cors());

app.use(express.json());

// ✅ Root route (fixes Cannot GET /)
app.get("/", (req, res) => {
    res.send("Server is running 🚀");
});

// ✅ Get Complaints
app.get("/complaints", (req, res) => {
    let data = fs.readFileSync("./complaints.json");
    res.json(JSON.parse(data));
});

// ✅ Add Complaint (match frontend URL)
app.post("/complaint", (req, res) => {

    let complaints = JSON.parse(
        fs.readFileSync("./complaints.json")
    );

    let newComplaint = {
        id: Date.now(),
        title: req.body.title,
        description: req.body.description,
        status: "Pending"
    };

    complaints.push(newComplaint);

    fs.writeFileSync(
        "./complaints.json",
        JSON.stringify(complaints, null, 2) // better formatting
    );

    res.send("Complaint Added Successfully");
});

app.listen(3000, () => console.log("Server running on port 3000"));