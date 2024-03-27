class Employee:
    def __init__(self, rfc, salary, rol):
        self.rfc = rfc
        self.salary = salary
        self.rol = rol
    def get_rfc(self):
        return self.rfc
    def get_salary(self):
        return self.salary
    def get_rol(self):
        return self.rol
    
    def set_salary(self,salary):
        self.salary = salary