package com.journals.tsijournals.model;

import java.util.List;

public class InPressResponse {


    /**
     * status : true
     * message : Records Found
     * inpress_details : [{"sno":"14538","month":"November","year":"2020","title":"LES of wind turbine modelling in farms and atmospheric conditions","author_names":"Steffan Ivannel","abstractlink":"les-of-wind-turbine-modelling-in-farms-and-atmospheric-conditions-14538.html","pdflink":null,"fulltextlink":null,"sup_file":"","art_type":"Abstract","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14539","month":"November","year":"2020","title":"Aircraft Nonlinear Coupling Longitudinal Modes","author_names":"Ashraff Omran","abstractlink":"aircraft-nonlinear-coupling-longitudinal-modes-14539.html","pdflink":null,"fulltextlink":null,"sup_file":"","art_type":"Abstract","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14540","month":"November","year":"2020","title":"An Optimal Strategy of Aircraft Turnaround Time for Passenger Boarding","author_names":"Fred Barez","abstractlink":"an-optimal-strategy-of-aircraft-turnaround-time-for-passenger-boarding-14540.html","pdflink":null,"fulltextlink":null,"sup_file":"","art_type":"Abstract","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14541","month":"November","year":"2020","title":"DISCUSSION OF SOLUTIONS FOR COMBINING ROTATIONS","author_names":"Shuh Jing Ying","abstractlink":"discussion-of-solutions-for-combining-rotations-14541.html","pdflink":null,"fulltextlink":null,"sup_file":"","art_type":"Abstract","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"},{"sno":"14542","month":"November","year":"2020","title":"Automation and Safety in the Cockpit","author_names":"Sabrina Craig","abstractlink":"automation-and-safety-in-the-cockpit-14542.html","pdflink":null,"fulltextlink":null,"sup_file":"","art_type":"Abstract","page_num":"","doi_num":"","doi_stat":"0","doi_stat_temp":"0"}]
     * inpress_cnt : 5
     */

    private boolean status;
    private String message;
    private int inpress_cnt;
    /**
     * sno : 14538
     * month : November
     * year : 2020
     * title : LES of wind turbine modelling in farms and atmospheric conditions
     * author_names : Steffan Ivannel
     * abstractlink : les-of-wind-turbine-modelling-in-farms-and-atmospheric-conditions-14538.html
     * pdflink : null
     * fulltextlink : null
     * sup_file :
     * art_type : Abstract
     * page_num :
     * doi_num :
     * doi_stat : 0
     * doi_stat_temp : 0
     */

    private List<InpressDetailsBean> inpress_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getInpress_cnt() {
        return inpress_cnt;
    }

    public void setInpress_cnt(int inpress_cnt) {
        this.inpress_cnt = inpress_cnt;
    }

    public List<InpressDetailsBean> getInpress_details() {
        return inpress_details;
    }

    public void setInpress_details(List<InpressDetailsBean> inpress_details) {
        this.inpress_details = inpress_details;
    }

    public static class InpressDetailsBean {
        private String sno;
        private String month;
        private String year;
        private String title;
        private String author_names;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String sup_file;
        private String art_type;
        private String page_num;
        private String doi_num;
        private String doi_stat;
        private String doi_stat_temp;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor_names() {
            return author_names;
        }

        public void setAuthor_names(String author_names) {
            this.author_names = author_names;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getSup_file() {
            return sup_file;
        }

        public void setSup_file(String sup_file) {
            this.sup_file = sup_file;
        }

        public String getArt_type() {
            return art_type;
        }

        public void setArt_type(String art_type) {
            this.art_type = art_type;
        }

        public String getPage_num() {
            return page_num;
        }

        public void setPage_num(String page_num) {
            this.page_num = page_num;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
        }

        public String getDoi_stat() {
            return doi_stat;
        }

        public void setDoi_stat(String doi_stat) {
            this.doi_stat = doi_stat;
        }

        public String getDoi_stat_temp() {
            return doi_stat_temp;
        }

        public void setDoi_stat_temp(String doi_stat_temp) {
            this.doi_stat_temp = doi_stat_temp;
        }
    }
}
