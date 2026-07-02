using System;
using System.Collections.Generic;

namespace StudentManagementMVC.Models;

public partial class Course
{
    public int CourseId { get; set; }

    public string CourseName { get; set; } = null!;
}
