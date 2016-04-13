package rslingo.rslil4privacy.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import rslingo.rslil4privacy.rSLIL4Privacy.Attribute;
import rslingo.rslil4privacy.rSLIL4Privacy.Collection;
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure;
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Informative;
import rslingo.rslil4privacy.rSLIL4Privacy.Metadata;
import rslingo.rslil4privacy.rSLIL4Privacy.Policy;
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RecipientPart;
import rslingo.rslil4privacy.rSLIL4Privacy.RefEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.RefRecipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefService;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePart;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;

@SuppressWarnings("all")
public class RSLIL4Privacy2JsonGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".json");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Policy> _filter = Iterators.<Policy>filter(_allContents, Policy.class);
    final Function1<Policy, CharSequence> _function = (Policy it) -> {
      return this.compile(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<Policy, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, " ");
    fsa.generateFile(_plus, _join);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compile(final Policy policy) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"name\": \"");
    Metadata _metadata = policy.getMetadata();
    String _name = _metadata.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Collection> _collection = policy.getCollection();
      boolean _isEmpty = _collection.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Collections\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Collection> _collection_1 = policy.getCollection();
          boolean _hasElements = false;
          for(final Collection c : _collection_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileCollection = this.compileCollection(c);
            _builder.append(_compileCollection, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Disclosure> _disclosure = policy.getDisclosure();
      boolean _isEmpty_1 = _disclosure.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Disclosure\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Disclosure> _disclosure_1 = policy.getDisclosure();
          boolean _hasElements_1 = false;
          for(final Disclosure d : _disclosure_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileDisclosure = this.compileDisclosure(d);
            _builder.append(_compileDisclosure, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Retention> _retention = policy.getRetention();
      boolean _isEmpty_2 = _retention.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Retention\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Retention> _retention_1 = policy.getRetention();
          boolean _hasElements_2 = false;
          for(final Retention r : _retention_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileRetention = this.compileRetention(r);
            _builder.append(_compileRetention, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Usage> _usage = policy.getUsage();
      boolean _isEmpty_3 = _usage.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Usage\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Usage> _usage_1 = policy.getUsage();
          boolean _hasElements_3 = false;
          for(final Usage u : _usage_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileUsage = this.compileUsage(u);
            _builder.append(_compileUsage, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Informative> _informative = policy.getInformative();
      boolean _isEmpty_4 = _informative.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.append("\"Informative\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Informative> _informative_1 = policy.getInformative();
          boolean _hasElements_4 = false;
          for(final Informative i : _informative_1) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileInformative = this.compileInformative(i);
            _builder.append(_compileInformative, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<PrivateData> _privateData = policy.getPrivateData();
      boolean _isEmpty_5 = _privateData.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.append(" \"PrivateDatums\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<PrivateData> _privateData_1 = policy.getPrivateData();
          boolean _hasElements_5 = false;
          for(final PrivateData pd : _privateData_1) {
            if (!_hasElements_5) {
              _hasElements_5 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compilePrivateData = this.compilePrivateData(pd);
            _builder.append(_compilePrivateData, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Recipient> _recipient = policy.getRecipient();
      boolean _isEmpty_6 = _recipient.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        _builder.append(" \"Recipients\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Recipient> _recipient_1 = policy.getRecipient();
          boolean _hasElements_6 = false;
          for(final Recipient r_1 : _recipient_1) {
            if (!_hasElements_6) {
              _hasElements_6 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileRecipient = this.compileRecipient(r_1);
            _builder.append(_compileRecipient, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Service> _service = policy.getService();
      boolean _isEmpty_7 = _service.isEmpty();
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        _builder.append("\"Services\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Service> _service_1 = policy.getService();
          boolean _hasElements_7 = false;
          for(final Service s : _service_1) {
            if (!_hasElements_7) {
              _hasElements_7 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileService = this.compileService(s);
            _builder.append(_compileService, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Enforcement> _enforcement = policy.getEnforcement();
      boolean _isEmpty_8 = _enforcement.isEmpty();
      boolean _not_8 = (!_isEmpty_8);
      if (_not_8) {
        _builder.append("\"Enforcements\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Enforcement> _enforcement_1 = policy.getEnforcement();
          boolean _hasElements_8 = false;
          for(final Enforcement e : _enforcement_1) {
            if (!_hasElements_8) {
              _hasElements_8 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileEnforcement = this.compileEnforcement(e);
            _builder.append(_compileEnforcement, "    ");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileCollection(final Collection c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = c.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = c.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = c.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refPrivateData = c.getRefPrivateData();
      boolean _isEmpty = _refPrivateData.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        EList<RefPrivateData> _refPrivateData_1 = c.getRefPrivateData();
        RefPrivateData _get = _refPrivateData_1.get(0);
        PrivateData _refPrivateData_2 = _get.getRefPrivateData();
        CharSequence _compileRefPrivateData = this.compileRefPrivateData(_refPrivateData_2);
        _builder.append(_compileRefPrivateData, "\t\t");
        {
          EList<RefPrivateData> _refPrivateData_3 = c.getRefPrivateData();
          RefPrivateData _get_1 = _refPrivateData_3.get(0);
          EList<PrivateData> _refs = _get_1.getRefs();
          for(final PrivateData p : _refs) {
            _builder.append(", ");
            CharSequence _compileRefPrivateData_1 = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refPDAll = c.getRefPDAll();
        boolean _equals = Objects.equal(_refPDAll, "All");
        if (_equals) {
          _builder.append("\"PrivateDatums\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefService> _refService = c.getRefService();
      boolean _isEmpty_1 = _refService.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Services\": [");
        EList<RefService> _refService_1 = c.getRefService();
        RefService _get_2 = _refService_1.get(0);
        Service _refService_2 = _get_2.getRefService();
        CharSequence _compileRefService = this.compileRefService(_refService_2);
        _builder.append(_compileRefService, "\t\t");
        {
          EList<RefService> _refService_3 = c.getRefService();
          RefService _get_3 = _refService_3.get(0);
          EList<Service> _refs_1 = _get_3.getRefs();
          for(final Service s : _refs_1) {
            _builder.append(", ");
            CharSequence _compileRefService_1 = this.compileRefService(s);
            _builder.append(_compileRefService_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refSAll = c.getRefSAll();
        boolean _equals_1 = Objects.equal(_refSAll, "All");
        if (_equals_1) {
          _builder.append("\"Services\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefEnforcement> _refEnforcement = c.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Enforcements\": [");
        EList<RefEnforcement> _refEnforcement_1 = c.getRefEnforcement();
        RefEnforcement _get_4 = _refEnforcement_1.get(0);
        Enforcement _refEnforcement_2 = _get_4.getRefEnforcement();
        CharSequence _compileRefEnforcement = this.compileRefEnforcement(_refEnforcement_2);
        _builder.append(_compileRefEnforcement, "\t\t");
        {
          EList<RefEnforcement> _refEnforcement_3 = c.getRefEnforcement();
          RefEnforcement _get_5 = _refEnforcement_3.get(0);
          EList<Enforcement> _refs_2 = _get_5.getRefs();
          for(final Enforcement e : _refs_2) {
            _builder.append(", ");
            CharSequence _compileRefEnforcement_1 = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refEAll = c.getRefEAll();
        boolean _equals_2 = Objects.equal(_refEAll, "All");
        if (_equals_2) {
          _builder.append("\"Enforcements\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modality = c.getModality();
      boolean _equals_3 = Objects.equal(_modality, "Permission");
      if (_equals_3) {
        _builder.append("Permission");
      } else {
        String _modality_1 = c.getModality();
        boolean _equals_4 = Objects.equal(_modality_1, "Obligation");
        if (_equals_4) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileDisclosure(final Disclosure d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = d.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = d.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = d.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefRecipient> _refRecipient = d.getRefRecipient();
      boolean _isEmpty = _refRecipient.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Recipients\": [");
        EList<RefRecipient> _refRecipient_1 = d.getRefRecipient();
        RefRecipient _get = _refRecipient_1.get(0);
        Recipient _refRecipient_2 = _get.getRefRecipient();
        CharSequence _compileRefRecipient = this.compileRefRecipient(_refRecipient_2);
        _builder.append(_compileRefRecipient, "\t\t");
        {
          EList<RefRecipient> _refRecipient_3 = d.getRefRecipient();
          RefRecipient _get_1 = _refRecipient_3.get(0);
          EList<Recipient> _refs = _get_1.getRefs();
          for(final Recipient r : _refs) {
            _builder.append(", ");
            CharSequence _compileRefRecipient_1 = this.compileRefRecipient(r);
            _builder.append(_compileRefRecipient_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refRAll = d.getRefRAll();
        boolean _equals = Objects.equal(_refRAll, "All");
        if (_equals) {
          _builder.append("\"Recipients\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refPrivateData = d.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"PrivateDatums\": [");
        EList<RefPrivateData> _refPrivateData_1 = d.getRefPrivateData();
        RefPrivateData _get_2 = _refPrivateData_1.get(0);
        PrivateData _refPrivateData_2 = _get_2.getRefPrivateData();
        CharSequence _compileRefPrivateData = this.compileRefPrivateData(_refPrivateData_2);
        _builder.append(_compileRefPrivateData, "\t\t");
        {
          EList<RefPrivateData> _refPrivateData_3 = d.getRefPrivateData();
          RefPrivateData _get_3 = _refPrivateData_3.get(0);
          EList<PrivateData> _refs_1 = _get_3.getRefs();
          for(final PrivateData p : _refs_1) {
            _builder.append(", ");
            CharSequence _compileRefPrivateData_1 = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refPDAll = d.getRefPDAll();
        boolean _equals_1 = Objects.equal(_refPDAll, "All");
        if (_equals_1) {
          _builder.append("\"PrivateDatums\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefService> _refService = d.getRefService();
      boolean _isEmpty_2 = _refService.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Services\": [");
        EList<RefService> _refService_1 = d.getRefService();
        RefService _get_4 = _refService_1.get(0);
        Service _refService_2 = _get_4.getRefService();
        CharSequence _compileRefService = this.compileRefService(_refService_2);
        _builder.append(_compileRefService, "\t\t");
        {
          EList<RefService> _refService_3 = d.getRefService();
          RefService _get_5 = _refService_3.get(0);
          EList<Service> _refs_2 = _get_5.getRefs();
          for(final Service s : _refs_2) {
            _builder.append(", ");
            CharSequence _compileRefService_1 = this.compileRefService(s);
            _builder.append(_compileRefService_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refSAll = d.getRefSAll();
        boolean _equals_2 = Objects.equal(_refSAll, "All");
        if (_equals_2) {
          _builder.append("\"Services\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefEnforcement> _refEnforcement = d.getRefEnforcement();
      boolean _isEmpty_3 = _refEnforcement.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Enforcements\": [");
        EList<RefEnforcement> _refEnforcement_1 = d.getRefEnforcement();
        RefEnforcement _get_6 = _refEnforcement_1.get(0);
        Enforcement _refEnforcement_2 = _get_6.getRefEnforcement();
        CharSequence _compileRefEnforcement = this.compileRefEnforcement(_refEnforcement_2);
        _builder.append(_compileRefEnforcement, "\t\t");
        {
          EList<RefEnforcement> _refEnforcement_3 = d.getRefEnforcement();
          RefEnforcement _get_7 = _refEnforcement_3.get(0);
          EList<Enforcement> _refs_3 = _get_7.getRefs();
          for(final Enforcement e : _refs_3) {
            _builder.append(", ");
            CharSequence _compileRefEnforcement_1 = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refEAll = d.getRefEAll();
        boolean _equals_3 = Objects.equal(_refEAll, "All");
        if (_equals_3) {
          _builder.append("\"Enforcements\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modality = d.getModality();
      boolean _equals_4 = Objects.equal(_modality, "Permission");
      if (_equals_4) {
        _builder.append("Permission");
      } else {
        String _modality_1 = d.getModality();
        boolean _equals_5 = Objects.equal(_modality_1, "Obligation");
        if (_equals_5) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileRetention(final Retention r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = r.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = r.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = r.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      String _period = r.getPeriod();
      boolean _isEmpty = _period.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Period\": \"");
        String _period_1 = r.getPeriod();
        _builder.append(_period_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refPrivateData = r.getRefPrivateData();
      boolean _isEmpty_1 = _refPrivateData.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"PrivateDatums\": [");
        EList<RefPrivateData> _refPrivateData_1 = r.getRefPrivateData();
        RefPrivateData _get = _refPrivateData_1.get(0);
        PrivateData _refPrivateData_2 = _get.getRefPrivateData();
        CharSequence _compileRefPrivateData = this.compileRefPrivateData(_refPrivateData_2);
        _builder.append(_compileRefPrivateData, "\t\t");
        {
          EList<RefPrivateData> _refPrivateData_3 = r.getRefPrivateData();
          RefPrivateData _get_1 = _refPrivateData_3.get(0);
          EList<PrivateData> _refs = _get_1.getRefs();
          for(final PrivateData p : _refs) {
            _builder.append(", ");
            CharSequence _compileRefPrivateData_1 = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refPDAll = r.getRefPDAll();
        boolean _equals = Objects.equal(_refPDAll, "All");
        if (_equals) {
          _builder.append("\"PrivateDatums\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefService> _refService = r.getRefService();
      boolean _isEmpty_2 = _refService.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Services\": [");
        EList<RefService> _refService_1 = r.getRefService();
        RefService _get_2 = _refService_1.get(0);
        Service _refService_2 = _get_2.getRefService();
        CharSequence _compileRefService = this.compileRefService(_refService_2);
        _builder.append(_compileRefService, "\t\t");
        {
          EList<RefService> _refService_3 = r.getRefService();
          RefService _get_3 = _refService_3.get(0);
          EList<Service> _refs_1 = _get_3.getRefs();
          for(final Service s : _refs_1) {
            _builder.append(", ");
            CharSequence _compileRefService_1 = this.compileRefService(s);
            _builder.append(_compileRefService_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refSAll = r.getRefSAll();
        boolean _equals_1 = Objects.equal(_refSAll, "All");
        if (_equals_1) {
          _builder.append("\"Services\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefEnforcement> _refEnforcement = r.getRefEnforcement();
      boolean _isEmpty_3 = _refEnforcement.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Enforcements\": [");
        EList<RefEnforcement> _refEnforcement_1 = r.getRefEnforcement();
        RefEnforcement _get_4 = _refEnforcement_1.get(0);
        Enforcement _refEnforcement_2 = _get_4.getRefEnforcement();
        CharSequence _compileRefEnforcement = this.compileRefEnforcement(_refEnforcement_2);
        _builder.append(_compileRefEnforcement, "\t\t");
        {
          EList<RefEnforcement> _refEnforcement_3 = r.getRefEnforcement();
          RefEnforcement _get_5 = _refEnforcement_3.get(0);
          EList<Enforcement> _refs_2 = _get_5.getRefs();
          for(final Enforcement e : _refs_2) {
            _builder.append(", ");
            CharSequence _compileRefEnforcement_1 = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refEAll = r.getRefEAll();
        boolean _equals_2 = Objects.equal(_refEAll, "All");
        if (_equals_2) {
          _builder.append("\"Enforcements\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modality = r.getModality();
      boolean _equals_3 = Objects.equal(_modality, "Permission");
      if (_equals_3) {
        _builder.append("Permission");
      } else {
        String _modality_1 = r.getModality();
        boolean _equals_4 = Objects.equal(_modality_1, "Obligation");
        if (_equals_4) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileUsage(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = u.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = u.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = u.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refPrivateData = u.getRefPrivateData();
      boolean _isEmpty = _refPrivateData.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        EList<RefPrivateData> _refPrivateData_1 = u.getRefPrivateData();
        RefPrivateData _get = _refPrivateData_1.get(0);
        PrivateData _refPrivateData_2 = _get.getRefPrivateData();
        CharSequence _compileRefPrivateData = this.compileRefPrivateData(_refPrivateData_2);
        _builder.append(_compileRefPrivateData, "\t\t");
        {
          EList<RefPrivateData> _refPrivateData_3 = u.getRefPrivateData();
          RefPrivateData _get_1 = _refPrivateData_3.get(0);
          EList<PrivateData> _refs = _get_1.getRefs();
          for(final PrivateData p : _refs) {
            _builder.append(", ");
            CharSequence _compileRefPrivateData_1 = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refPDAll = u.getRefPDAll();
        boolean _equals = Objects.equal(_refPDAll, "All");
        if (_equals) {
          _builder.append("\"PrivateDatums\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefService> _refService = u.getRefService();
      boolean _isEmpty_1 = _refService.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Services\": [");
        EList<RefService> _refService_1 = u.getRefService();
        RefService _get_2 = _refService_1.get(0);
        Service _refService_2 = _get_2.getRefService();
        CharSequence _compileRefService = this.compileRefService(_refService_2);
        _builder.append(_compileRefService, "\t\t");
        {
          EList<RefService> _refService_3 = u.getRefService();
          RefService _get_3 = _refService_3.get(0);
          EList<Service> _refs_1 = _get_3.getRefs();
          for(final Service s : _refs_1) {
            _builder.append(", ");
            CharSequence _compileRefService_1 = this.compileRefService(s);
            _builder.append(_compileRefService_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refSAll = u.getRefSAll();
        boolean _equals_1 = Objects.equal(_refSAll, "All");
        if (_equals_1) {
          _builder.append("\"Services\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefEnforcement> _refEnforcement = u.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Enforcements\": [");
        EList<RefEnforcement> _refEnforcement_1 = u.getRefEnforcement();
        RefEnforcement _get_4 = _refEnforcement_1.get(0);
        Enforcement _refEnforcement_2 = _get_4.getRefEnforcement();
        CharSequence _compileRefEnforcement = this.compileRefEnforcement(_refEnforcement_2);
        _builder.append(_compileRefEnforcement, "\t\t");
        {
          EList<RefEnforcement> _refEnforcement_3 = u.getRefEnforcement();
          RefEnforcement _get_5 = _refEnforcement_3.get(0);
          EList<Enforcement> _refs_2 = _get_5.getRefs();
          for(final Enforcement e : _refs_2) {
            _builder.append(", ");
            CharSequence _compileRefEnforcement_1 = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refEAll = u.getRefEAll();
        boolean _equals_2 = Objects.equal(_refEAll, "All");
        if (_equals_2) {
          _builder.append("\"Enforcements\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modality = u.getModality();
      boolean _equals_3 = Objects.equal(_modality, "Permission");
      if (_equals_3) {
        _builder.append("Permission");
      } else {
        String _modality_1 = u.getModality();
        boolean _equals_4 = Objects.equal(_modality_1, "Obligation");
        if (_equals_4) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileInformative(final Informative i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = i.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = i.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = i.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refPrivateData = i.getRefPrivateData();
      boolean _isEmpty = _refPrivateData.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        EList<RefPrivateData> _refPrivateData_1 = i.getRefPrivateData();
        RefPrivateData _get = _refPrivateData_1.get(0);
        PrivateData _refPrivateData_2 = _get.getRefPrivateData();
        CharSequence _compileRefPrivateData = this.compileRefPrivateData(_refPrivateData_2);
        _builder.append(_compileRefPrivateData, "\t\t");
        {
          EList<RefPrivateData> _refPrivateData_3 = i.getRefPrivateData();
          RefPrivateData _get_1 = _refPrivateData_3.get(0);
          EList<PrivateData> _refs = _get_1.getRefs();
          for(final PrivateData p : _refs) {
            _builder.append(", ");
            CharSequence _compileRefPrivateData_1 = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refPDAll = i.getRefPDAll();
        boolean _equals = Objects.equal(_refPDAll, "All");
        if (_equals) {
          _builder.append("\"PrivateDatums\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefService> _refService = i.getRefService();
      boolean _isEmpty_1 = _refService.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Services\": [");
        EList<RefService> _refService_1 = i.getRefService();
        RefService _get_2 = _refService_1.get(0);
        Service _refService_2 = _get_2.getRefService();
        CharSequence _compileRefService = this.compileRefService(_refService_2);
        _builder.append(_compileRefService, "\t\t");
        {
          EList<RefService> _refService_3 = i.getRefService();
          RefService _get_3 = _refService_3.get(0);
          EList<Service> _refs_1 = _get_3.getRefs();
          for(final Service s : _refs_1) {
            _builder.append(", ");
            CharSequence _compileRefService_1 = this.compileRefService(s);
            _builder.append(_compileRefService_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refSAll = i.getRefSAll();
        boolean _equals_1 = Objects.equal(_refSAll, "All");
        if (_equals_1) {
          _builder.append("\"Services\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefEnforcement> _refEnforcement = i.getRefEnforcement();
      boolean _isEmpty_2 = _refEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Enforcements\": [");
        EList<RefEnforcement> _refEnforcement_1 = i.getRefEnforcement();
        RefEnforcement _get_4 = _refEnforcement_1.get(0);
        Enforcement _refEnforcement_2 = _get_4.getRefEnforcement();
        CharSequence _compileRefEnforcement = this.compileRefEnforcement(_refEnforcement_2);
        _builder.append(_compileRefEnforcement, "\t\t");
        {
          EList<RefEnforcement> _refEnforcement_3 = i.getRefEnforcement();
          RefEnforcement _get_5 = _refEnforcement_3.get(0);
          EList<Enforcement> _refs_2 = _get_5.getRefs();
          for(final Enforcement e : _refs_2) {
            _builder.append(", ");
            CharSequence _compileRefEnforcement_1 = this.compileRefEnforcement(e);
            _builder.append(_compileRefEnforcement_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refEAll = i.getRefEAll();
        boolean _equals_2 = Objects.equal(_refEAll, "All");
        if (_equals_2) {
          _builder.append("\"Enforcements\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modality = i.getModality();
      boolean _equals_3 = Objects.equal(_modality, "Permission");
      if (_equals_3) {
        _builder.append("Permission");
      } else {
        String _modality_1 = i.getModality();
        boolean _equals_4 = Objects.equal(_modality_1, "Obligation");
        if (_equals_4) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileRefRecipient(final Recipient r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = r.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileRefPrivateData(final PrivateData p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = p.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileRefService(final Service s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = s.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileRefEnforcement(final Enforcement e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilePrivateData(final PrivateData p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = p.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = p.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _type = p.getType();
      boolean _equals = Objects.equal(_type, "PersonalInformation");
      if (_equals) {
        _builder.append("PersonalInformation");
      } else {
        _builder.append("UsageInformation");
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<Attribute> _attribute = p.getAttribute();
      boolean _isEmpty = _attribute.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Attributes\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        {
          EList<Attribute> _attribute_1 = p.getAttribute();
          boolean _hasElements = false;
          for(final Attribute a : _attribute_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compileAttr = this.compileAttr(a);
            _builder.append(_compileAttr, "\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileAttr(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"name\": \"");
    String _name = a.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = a.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileRecipient(final Recipient r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = r.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Name\": \"");
    String _recipientName = r.getRecipientName();
    _builder.append(_recipientName, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = r.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RecipientPart> _recipientPart = r.getRecipientPart();
      boolean _isEmpty = _recipientPart.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Recipient_Parts\": [");
        {
          EList<RecipientPart> _recipientPart_1 = r.getRecipientPart();
          boolean _hasElements = false;
          for(final RecipientPart rp : _recipientPart_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerpartr = this.compilerpartr(rp);
            _builder.append(_compilerpartr, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _type = r.getType();
      boolean _equals = Objects.equal(_type, "Individual");
      if (_equals) {
        _builder.append("Individual");
      } else {
        String _type_1 = r.getType();
        boolean _equals_1 = Objects.equal(_type_1, "Organization");
        if (_equals_1) {
          _builder.append("Organization");
        } else {
          _builder.append("Individual/Organization");
        }
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Scope\": \"");
    {
      String _scope = r.getScope();
      boolean _equals_2 = Objects.equal(_scope, "Internal");
      if (_equals_2) {
        _builder.append("Internal");
      } else {
        String _scope_1 = r.getScope();
        boolean _equals_3 = Objects.equal(_scope_1, "External");
        if (_equals_3) {
          _builder.append("External");
        } else {
          _builder.append("Internal/External");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerpartr(final RecipientPart r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Recipient _recipientPart = r.getRecipientPart();
    String _recipientName = _recipientPart.getRecipientName();
    _builder.append(_recipientName, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileService(final Service s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refPrivateData = s.getRefPrivateData();
      boolean _isEmpty = _refPrivateData.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        EList<RefPrivateData> _refPrivateData_1 = s.getRefPrivateData();
        RefPrivateData _get = _refPrivateData_1.get(0);
        PrivateData _refPrivateData_2 = _get.getRefPrivateData();
        CharSequence _compileRefPrivateData = this.compileRefPrivateData(_refPrivateData_2);
        _builder.append(_compileRefPrivateData, "\t\t");
        {
          EList<RefPrivateData> _refPrivateData_3 = s.getRefPrivateData();
          RefPrivateData _get_1 = _refPrivateData_3.get(0);
          EList<PrivateData> _refs = _get_1.getRefs();
          for(final PrivateData p : _refs) {
            _builder.append(", ");
            CharSequence _compileRefPrivateData_1 = this.compileRefPrivateData(p);
            _builder.append(_compileRefPrivateData_1, "\t\t");
          }
        }
        _builder.append("],");
      } else {
        String _refPDAll = s.getRefPDAll();
        boolean _equals = Objects.equal(_refPDAll, "All");
        if (_equals) {
          _builder.append("\"PrivateDatums\": [\"All\"],");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ServicePart> _servicePart = s.getServicePart();
      boolean _isEmpty_1 = _servicePart.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Service_Parts\": [");
        {
          EList<ServicePart> _servicePart_1 = s.getServicePart();
          boolean _hasElements = false;
          for(final ServicePart sp : _servicePart_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerservicePart = this.compilerservicePart(sp);
            _builder.append(_compilerservicePart, "\t\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerservicePart(final ServicePart s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _servicePart = s.getServicePart();
    String _name = _servicePart.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileEnforcement(final Enforcement e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = e.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Name\": \"");
    String _enforcementName = e.getEnforcementName();
    _builder.append(_enforcementName, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = e.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _type = e.getType();
      boolean _equals = Objects.equal(_type, "Action");
      if (_equals) {
        _builder.append("Action");
      } else {
        String _type_1 = e.getType();
        boolean _equals_1 = Objects.equal(_type_1, "Algorithm");
        if (_equals_1) {
          _builder.append("Algorithm");
        } else {
          String _type_2 = e.getType();
          boolean _equals_2 = Objects.equal(_type_2, "Config");
          if (_equals_2) {
            _builder.append("Config");
          } else {
            String _type_3 = e.getType();
            boolean _equals_3 = Objects.equal(_type_3, "Process");
            if (_equals_3) {
              _builder.append("Process");
            } else {
              _builder.append("Tool");
            }
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
