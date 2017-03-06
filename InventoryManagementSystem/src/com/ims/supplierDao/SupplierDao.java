package com.ims.supplierDao;

import java.util.List;

import com.ims.supplierbean.Supplier;

public interface SupplierDao {
public List<Supplier> viewSupplier();
public Supplier updateSupplier(Supplier s);
public String deletesupplier(Supplier s);
public String insertSupplier(Supplier s);

}
