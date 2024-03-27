class Person:
    def __init__(self,name,last_name,birth_date,curp):
        self.name = name
        self.last_name = last_name
        self.birth_date = birth_date
        self.curp = curp
    
    def get_name(self):
        return self.name
    def set_name(self,name):
        self.name = name
    def set_last_name(self,last_name):
        self.last_name = last_name
    def set_birth_date(self,birth_date):
        self.birth_date = birth_date
    def set_curp(self,curp):
        self.curp = curp