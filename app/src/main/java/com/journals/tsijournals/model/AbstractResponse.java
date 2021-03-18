package com.journals.tsijournals.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AbstractResponse {


    /**
     * status : true
     * abstract : 2
     * abstract_details : [{"sno":"13456","journal":"tsbmbl","title":"A Review on Computational Drug Designing.and Discovery","author_names":"Divya Paladugula","keywords":"Drug discovery, Autodock, Malaria, Flaviviruses, Tuberculosis, ligand, Zikavirus, Dengue","abstract":"<p style=\"text-align: justify;\">Novel Drug discovery and the development of new medicine is a time-consuming, complex, costly and highly risky process. This is the reason computer-aided drug design (CADD) approaches are widely used in the pharmaceutical industry to accelerate the procedure and the hit rate of novel drug compounds, as it uses a much more targeted search than the traditional HTS. On an average of 10 to 15 years and US $500-800 million to introduce a drug into the market along with the synthesis and testing of lead compounds. Therefore, it is beneficial to apply computational tools in hit-to-lead optimization to cover a wider chemical space while reducing the compounds to synthesize and test in vitro.  Homology modeling is used for the prediction of three-dimensional structure of the protein, whereas molecular docking is been performed to study the interaction of a drug molecule with the protein. The best orientation of docked structure (ligand-protein) obtained based in the overall minimum energy. In silico methods are used to identify potential drugs for various diseases. Thus, computer-aided drug designing has played an integral part of the drug discovery process. The main purpose of this review article is to give a glimpse about the part Computer Aided Drug Design has played in present medical science and the scope it conveys in the near future, in the service of designing newer drugs along with lesser expenditure of time and money.<\/p>","doi_num":"","abstractlink":"a-review-on-computational-drug-designingand-discovery-13456.html","pdflink":"https://www.tsijournals.com/articles/a-review-on-computational-drug-designingand-discovery.pdf","fulltextlink":null,"year":"2017","page_num":"","pub_date":"0000-00-00","rec_date":"","date":"2017-10-27","old_omics_id":"","domain_name":"https://www.tsijournals.com/","vol":"3","issue":"3","vol_issue_name":"Volume 3, Issue 3"},{"sno":"13456","journal":"tsbmbl","title":"A Review on Computational Drug Designing.and Discovery","author_names":"Divya Paladugula","keywords":"Drug discovery, Autodock, Malaria, Flaviviruses, Tuberculosis, ligand, Zikavirus, Dengue","abstract":"<p style=\"text-align: justify;\">Novel Drug discovery and the development of new medicine is a time-consuming, complex, costly and highly risky process. This is the reason computer-aided drug design (CADD) approaches are widely used in the pharmaceutical industry to accelerate the procedure and the hit rate of novel drug compounds, as it uses a much more targeted search than the traditional HTS. On an average of 10 to 15 years and US $500-800 million to introduce a drug into the market along with the synthesis and testing of lead compounds. Therefore, it is beneficial to apply computational tools in hit-to-lead optimization to cover a wider chemical space while reducing the compounds to synthesize and test in vitro.  Homology modeling is used for the prediction of three-dimensional structure of the protein, whereas molecular docking is been performed to study the interaction of a drug molecule with the protein. The best orientation of docked structure (ligand-protein) obtained based in the overall minimum energy. In silico methods are used to identify potential drugs for various diseases. Thus, computer-aided drug designing has played an integral part of the drug discovery process. The main purpose of this review article is to give a glimpse about the part Computer Aided Drug Design has played in present medical science and the scope it conveys in the near future, in the service of designing newer drugs along with lesser expenditure of time and money.<\/p>","doi_num":"","abstractlink":"a-review-on-computational-drug-designingand-discovery-13456.html","pdflink":"https://www.tsijournals.com/articles/a-review-on-computational-drug-designingand-discovery.pdf","fulltextlink":null,"year":"2017","page_num":"","pub_date":"0000-00-00","rec_date":"","date":"2017-10-27","old_omics_id":"","domain_name":"https://www.tsijournals.com/","vol":"3","issue":"3","vol_issue_name":"Volume 3, Issue 3"}]
     */

    private boolean status;
    @SerializedName("abstract")
    private int abstractX;
    /**
     * sno : 13456
     * journal : tsbmbl
     * title : A Review on Computational Drug Designing.and Discovery
     * author_names : Divya Paladugula
     * keywords : Drug discovery, Autodock, Malaria, Flaviviruses, Tuberculosis, ligand, Zikavirus, Dengue
     * abstract : <p style="text-align: justify;">Novel Drug discovery and the development of new medicine is a time-consuming, complex, costly and highly risky process. This is the reason computer-aided drug design (CADD) approaches are widely used in the pharmaceutical industry to accelerate the procedure and the hit rate of novel drug compounds, as it uses a much more targeted search than the traditional HTS. On an average of 10 to 15 years and US $500-800 million to introduce a drug into the market along with the synthesis and testing of lead compounds. Therefore, it is beneficial to apply computational tools in hit-to-lead optimization to cover a wider chemical space while reducing the compounds to synthesize and test in vitro.  Homology modeling is used for the prediction of three-dimensional structure of the protein, whereas molecular docking is been performed to study the interaction of a drug molecule with the protein. The best orientation of docked structure (ligand-protein) obtained based in the overall minimum energy. In silico methods are used to identify potential drugs for various diseases. Thus, computer-aided drug designing has played an integral part of the drug discovery process. The main purpose of this review article is to give a glimpse about the part Computer Aided Drug Design has played in present medical science and the scope it conveys in the near future, in the service of designing newer drugs along with lesser expenditure of time and money.</p>
     * doi_num :
     * abstractlink : a-review-on-computational-drug-designingand-discovery-13456.html
     * pdflink : https://www.tsijournals.com/articles/a-review-on-computational-drug-designingand-discovery.pdf
     * fulltextlink : null
     * year : 2017
     * page_num :
     * pub_date : 0000-00-00
     * rec_date :
     * date : 2017-10-27
     * old_omics_id :
     * domain_name : https://www.tsijournals.com/
     * vol : 3
     * issue : 3
     * vol_issue_name : Volume 3, Issue 3
     */

    private List<AbstractDetailsBean> abstract_details;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(int abstractX) {
        this.abstractX = abstractX;
    }

    public List<AbstractDetailsBean> getAbstract_details() {
        return abstract_details;
    }

    public void setAbstract_details(List<AbstractDetailsBean> abstract_details) {
        this.abstract_details = abstract_details;
    }

    public static class AbstractDetailsBean {
        private String sno;
        private String journal;
        private String title;
        private String author_names;
        private String keywords;
        @SerializedName("abstract")
        private String abstractX;
        private String doi_num;
        private String abstractlink;
        private String pdflink;
        private String fulltextlink;
        private String year;
        private String page_num;
        private String pub_date;
        private String rec_date;
        private String date;
        private String old_omics_id;
        private String domain_name;
        private String vol;
        private String issue;
        private String vol_issue_name;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
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

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getDoi_num() {
            return doi_num;
        }

        public void setDoi_num(String doi_num) {
            this.doi_num = doi_num;
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

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getPage_num() {
            return page_num;
        }

        public void setPage_num(String page_num) {
            this.page_num = page_num;
        }

        public String getPub_date() {
            return pub_date;
        }

        public void setPub_date(String pub_date) {
            this.pub_date = pub_date;
        }

        public String getRec_date() {
            return rec_date;
        }

        public void setRec_date(String rec_date) {
            this.rec_date = rec_date;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getOld_omics_id() {
            return old_omics_id;
        }

        public void setOld_omics_id(String old_omics_id) {
            this.old_omics_id = old_omics_id;
        }

        public String getDomain_name() {
            return domain_name;
        }

        public void setDomain_name(String domain_name) {
            this.domain_name = domain_name;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public String getVol_issue_name() {
            return vol_issue_name;
        }

        public void setVol_issue_name(String vol_issue_name) {
            this.vol_issue_name = vol_issue_name;
        }
    }
}
