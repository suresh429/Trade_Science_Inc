package com.journals.tsijournals.model;

import java.util.List;

public class EditorialBoardResponse {


    /**
     * editorialboardarr : [{"ename":"Norbert Weiss","editor_description":"Department of Physiology and Pharmacology, Hotchkiss Brain Institute - University of Calgary, Calgary, Canada","editor_type":""},{"ename":"Zebo Huang","editor_description":"Guangdong Pharmaceutical University, Guangzhou, P.R.China","editor_type":""},{"ename":"Yutaka Nibu","editor_description":"Department of Cell and Developmental Biology, Weill Medical College of Cornell University, USA","editor_type":""},{"ename":"Vittorio Gentile, M. D., Ph.D","editor_description":"Department of Biochemistry, Biophysics and General Pathology, Second University of Naples, Italy","editor_type":""},{"ename":"Pothana Saikumar","editor_description":"Department of Pathology, UT Health Science Center at San Antonio, USA","editor_type":""},{"ename":"Anastasia S. Politou Ph.D","editor_description":"Biological Chemistry Lab, University of Ioannina, Ioannina, Greece","editor_type":""},{"ename":"Yusuf Tutar","editor_description":"Cumhuriyet University, Biochemistry Department, Sivas, Turkey","editor_type":""},{"ename":"Claudia J. Lagranha","editor_description":"Dept.Biochemistry and Exercise Biochemistry, Federal University of Pernambuco-CAV Pernambuco, Brazil","editor_type":""},{"ename":"Kusal K.Das","editor_description":"Department of Physiology, BLDE University, India","editor_type":""},{"ename":"Lucia Malaguarnera","editor_description":"Dept. of Bio-Medical Sciences, University of Catania, Catania, Italy","editor_type":""},{"ename":"Katya Carbone","editor_description":"Council for Research and Experimentation in Agriculture, Fruit Tree Research Center (CRA-FRU), Chemistry, Biochemistry and Technology of Natural Organic Compounds, via Fioranello 52 00134 - ROMA","editor_type":""},{"ename":"Massimo Micaroni","editor_description":"Bio-imaging Centre - Biosciences, College of Life and Environmental Sciences, United Kingdom","editor_type":""},{"ename":"Stephanie M Cabarcas","editor_description":"Department of Biology, Gannon University, USA","editor_type":""},{"ename":"Khalid Dafaallah Awadelkarim","editor_description":"Head, Department of Molecular Biology, National cancer Institute (NCI-UG), University of Gezira, Sudan","editor_type":""},{"ename":"Demetrios A. Arvanitis","editor_description":"Molecular Biology Division, Biomedical Research Foundation, Greece","editor_type":""},{"ename":"Zsolt Balogi","editor_description":"Center for Advanced Bioanalysis GmbH, Linz, Austria","editor_type":""},{"ename":"Aritoshi Iida","editor_description":"Laboratory for Bone and Joint Diseases, RIKEN Center for Integrative Medical Sciences, Tokyo, Japan","editor_type":""},{"ename":"Bechan Sharma","editor_description":"Professor of Biochemistry & Ex-Chairman, Department of Biochemistry University of Allahabad, India","editor_type":""},{"ename":"Maulin P. Shah","editor_description":"Sr. Mgr & Head-Microbiology Lab, Enviro Technology Limited, India","editor_type":""}]
     * editorial_cnt : 19
     */

    private int editorial_cnt;
    /**
     * ename : Norbert Weiss
     * editor_description : Department of Physiology and Pharmacology, Hotchkiss Brain Institute - University of Calgary, Calgary, Canada
     * editor_type :
     */

    private List<EditorialboardarrBean> editorialboardarr;

    public int getEditorial_cnt() {
        return editorial_cnt;
    }

    public void setEditorial_cnt(int editorial_cnt) {
        this.editorial_cnt = editorial_cnt;
    }

    public List<EditorialboardarrBean> getEditorialboardarr() {
        return editorialboardarr;
    }

    public void setEditorialboardarr(List<EditorialboardarrBean> editorialboardarr) {
        this.editorialboardarr = editorialboardarr;
    }

    public static class EditorialboardarrBean {
        private String ename;
        private String editor_description;
        private String editor_type;

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getEditor_description() {
            return editor_description;
        }

        public void setEditor_description(String editor_description) {
            this.editor_description = editor_description;
        }

        public String getEditor_type() {
            return editor_type;
        }

        public void setEditor_type(String editor_type) {
            this.editor_type = editor_type;
        }
    }
}
