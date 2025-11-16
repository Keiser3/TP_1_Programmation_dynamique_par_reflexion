package com.tp1.Metier;

import com.tp1.Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }
}