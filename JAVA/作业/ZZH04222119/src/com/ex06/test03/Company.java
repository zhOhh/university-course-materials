package com.ex06.test03;

class Company {
   Employee[] employees = new Employee[9];
   Company(Employee[] employee) {
      for (int i = 0; i < 9; i++) {
         this.employees[i] = employee[i];
      }
   }
   double salaryPlay() {
      double allEarning = 0;
      for (int i = 0; i < 9; i++) {
         allEarning += employees[i].earnings();
      }
      return allEarning;
   }
}
